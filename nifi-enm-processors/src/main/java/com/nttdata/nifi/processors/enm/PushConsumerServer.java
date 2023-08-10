package com.nttdata.nifi.processors.enm;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jacorb.orb.ORB;
import org.jacorb.orb.ParsedIOR;
import org.jacorb.orb.etf.ProfileBase;
import org.jacorb.orb.iiop.IIOPAddress;
import org.jacorb.orb.iiop.IIOPProfile;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CosEventComm.Disconnected;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;
import org.omg.CosNotification._EventType;
import org.omg.CosNotifyChannelAdmin.*;
import org.omg.CosNotifyComm.InvalidEventType;
import org.omg.CosNotifyComm.SequencePushConsumer;
import org.omg.CosNotifyComm.SequencePushConsumerPOA;
import org.omg.ETF.Profile;
import org.omg.PortableServer.IdAssignmentPolicyValue;
import org.omg.PortableServer.LifespanPolicyValue;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;

//import com.nsn.oss.nbi.nms.simulator.pushconsumer.User2SignalHandler;

class PushConsumerServer extends SequencePushConsumerPOA implements Callable<String> {
    private static final Logger LOGGER = Logger.getLogger(PushConsumerServer.class);
    private static ORB orb;
    private Parameter4PushConsumer parameters;
    private EventsHandler eventHandler;
    private int count;
    private String iorStr;

    public PushConsumerServer(Parameter4PushConsumer psParameter, String vendor, String network_type) {
        this.count = 0;
        this.parameters = psParameter;
        initLogger(psParameter);
        this.eventHandler = new EventsHandler(this.parameters, vendor, network_type);
    }


    public void disconnect_sequence_push_consumer() {
        EventPrinter.printMsg("disconnect_sequence_push_consumer", this.parameters.isPET(), Level.INFO, LOGGER);

        if (this.parameters.isPET()) {
            LOGGER.info("disconnect_sequence_push_consumer");
        }
    }

    public void push_structured_events(StructuredEvent[] ses) throws Disconnected {
        for (StructuredEvent se : ses) {
            this.eventHandler.insert(se);
        }
        //if (!User2SignalHandler.isBlock()) {
        //    System.out.println("---skip sleep---");
        //    return;
        //}
        if (this.count++ > 2 && this.parameters.getDelay() > 0L) {

            try {
                String message = "----  recv batch size=" + ses.length + " ,sleep " + this.parameters.getDelay() + "------------";

                System.out.println(message);
                Thread.sleep(this.parameters.getDelay());
            } catch (InterruptedException e) {
                LOGGER.error("sleep failed in push_structured_events", e);
            }
        }
    }

    public void offer_change(_EventType[] arg0, _EventType[] arg1) throws InvalidEventType {
    }

    public static void initLogger(Parameter4PushConsumer parameters) {
        Appender appender = Logger.getRootLogger().getAppender("FILE");
        if (appender != null) {
            if (appender instanceof FileAppender) {

                FileAppender fileAppender = (FileAppender) appender;
                String logFullPath = parameters.getLogFullPath();
                if (logFullPath != null) {
                    fileAppender.setFile(logFullPath);
                }

                fileAppender.activateOptions();
            } else {
                System.out.println("No FileAppender found for " + appender.getName());
            }
        }
    }

    public void start() {
        this.eventHandler.start();

        System.setProperty("org.omg.CORBA.ORBClass", "org.jacorb.orb.ORB");
        System.setProperty("org.omg.CORBA.ORBSingletonClass", "org.jacorb.orb.ORBSingleton");
        System.setProperty("jacorb.home", ".");

        LOGGER.debug("org.omg.CORBA.ORBClass:" + System.getProperty("org.omg.CORBA.ORBClass"));
        LOGGER.debug("org.omg.CORBA.ORBSingletonClasss:" + System.getProperty("org.omg.CORBA.ORBSingletonClass"));
        LOGGER.debug("jacorb.home:" + System.getProperty("jacorb.home"));

        Properties properties = new Properties();
        properties.put("jacorb.implname", "Everis NMS");
        int port = this.parameters.getPort();
        if (port > 0) {
            System.setProperty("OAPort", String.valueOf(port));
            LOGGER.debug("OAPort = " + port);
        }

        if (this.parameters.getSslPort() > 0) {
            System.setProperty("OASSLPort", String.valueOf(this.parameters.getSslPort()));
            LOGGER.debug("OASSLPort = " + this.parameters.getSslPort());
        }

        this.orb = (ORB) ORB.init(this.parameters.getArgs(), properties);

        try {
            POA rootPoa = POAHelper.narrow(this.orb.resolve_initial_references("RootPOA"));

            Policy[] policies = null;
            if (this.parameters.isPersistent()) {
                policies = new Policy[2];
                policies[0] = rootPoa.create_id_assignment_policy(IdAssignmentPolicyValue.USER_ID);
                policies[1] = rootPoa.create_lifespan_policy(LifespanPolicyValue.PERSISTENT);
            } else {

                policies = new Policy[1];
                policies[0] = rootPoa.create_lifespan_policy(LifespanPolicyValue.TRANSIENT);
            }

            POA poa = rootPoa.create_POA("PushConsumerPOA", rootPoa.the_POAManager(), policies);

            poa.the_POAManager().activate();
            SequencePushConsumer sePushConsumer = _this(this.orb);

            int newPort = port;
            if (newPort == 0) {
                newPort = getPortFromIor(this.orb.object_to_string(sePushConsumer));
            }
            if (this.parameters.isPersistent()) {
                String object_id = "port:" + newPort;
                poa.activate_object_with_id(object_id.getBytes(), this);
            } else {
                poa.activate_object(this);
            }

            this.iorStr = this.orb.object_to_string(poa.servant_to_reference(this));
            System.out.println(this.iorStr);

            if (this.parameters.getChannelName() != null) {
                Object o = this.orb.resolve_initial_references("NotificationService");
                EventChannelFactory ef = null;
                if (!o._non_existent()) {
                    ef = EventChannelFactoryHelper.narrow(o);
                    EventPrinter.printMsg(ef.toString(), this.parameters.isPET(), Level.INFO, LOGGER);
                }

                NamingContextExt namingContext = NamingContextExtHelper.narrow(this.orb.resolve_initial_references("NameService"));

                EventChannel adminChannel = null;
                try {
                    Object ob = namingContext.resolve(namingContext.to_name(this.parameters.getChannelName()));
                    adminChannel = EventChannelHelper.narrow(ob);
                } catch (NotFound notfound) {
                    if (this.parameters.isCreateIfNotExist()) {
                        IntHolder idHolder = new IntHolder();

                        Property[] qos = new Property[0];
                        Property[] adm = new Property[0];
                        adminChannel = ef.create_channel(qos, adm, idHolder);
                        namingContext.bind(namingContext.to_name(this.parameters.getChannelName()), adminChannel);
                    } else {
                        EventPrinter.printMsg("ChannelName Not Found in Naming Service", this.parameters.isPET(), Level.INFO, LOGGER);

                        System.exit(1);
                    }
                }
                ConsumerAdmin consumerAdmin = adminChannel.default_consumer_admin();
                SequenceProxyPushSupplier proxyPushSupplier = SequenceProxyPushSupplierHelper.narrow(consumerAdmin
                        .obtain_notification_push_supplier(ClientType.SEQUENCE_EVENT, new IntHolder()));
                proxyPushSupplier.connect_sequence_push_consumer(sePushConsumer);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void blockingRun() {
        try {
            this.orb.run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private int getPortFromIor(String ior) {
        int port = 0;
        try {
            ParsedIOR pior = new ParsedIOR((ORB) this.orb, ior);
            List<Profile> profiles = pior.getProfiles();

            for (Profile profile : profiles) {
                ProfileBase base = (ProfileBase) profile;
                if (base instanceof IIOPProfile) {
                    port = ((IIOPAddress) ((IIOPProfile) profile).getAddress()).getPort();
                    if (port < 0) {
                        port += 65536;
                    }
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.error("Parse IOR failed", e);
        }
        return port;
    }

    public String call() throws Exception {
        start();
        return "finish";
    }

    public String getIorStr() throws Exception {
        return this.iorStr;
    }

    public void setIorStr(String iorStr) {
        this.iorStr = iorStr;
    }

    public static void shutdown() {
        orb.shutdown(true);
        LOGGER.info("stopping consumer server");
    }

}

