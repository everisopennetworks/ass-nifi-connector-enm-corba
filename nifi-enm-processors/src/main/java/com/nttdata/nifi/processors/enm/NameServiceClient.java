package com.nttdata.nifi.processors.enm;

import org.omg.AlarmIRPSystem.AlarmIRPOperations;
import org.omg.AlarmIRPSystem.AlarmIRPOperationsHelper;
import org.omg.AlarmIRPSystem.AlarmInformationIteratorHolder;
import org.omg.AlarmIRPSystem.NextAlarmInformations;
import org.omg.CORBA.BooleanHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNotification.EventBatchHolder;
import org.omg.CosNotification.StructuredEvent;
import org.omg.NotificationIRPSystem.NotificationIRPOperations;
import org.omg.NotificationIRPSystem.NotificationIRPOperationsHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameServiceClient {

    private final Logger logger = LoggerFactory.getLogger(NameServiceClient.class);
    private static final short ALARM_SIZE = 100;
    private static final String FILTER = "";
    private static final String CONSUMER_NAME = "com/ericsson/nms/cif/service/NMSNAConsumer";
    private static final String ALARM_CONSUMER_NAME = "com/ericsson/nms/fm_cirpagent/AlarmIRP";
    private static final String[] CATEGORIES = {"1f1", "1z1"};

    private final String localIOR;
    private final String externalIOR;
    private NotificationIRPOperations notificationIRP = null;

    private String subsid = null;

    private org.omg.CORBA.Object localNameService = null;

    public NameServiceClient(String localIOR, String externalIOR) {
        this.localIOR = localIOR;
        this.externalIOR = externalIOR;
    }

    public void stop() {
        try {
            notificationIRP.detach(localNameService.toString(), subsid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("Corba detach succeeded");
    }

    public void start() {
        // Resolve the CORBA Naming Service
        try {

            final Properties externalProperties = new Properties();
            externalProperties.put("ORBInitRef.NameService", externalIOR);

            final ORB externalORB = ORB.init(new String[0], externalProperties);

            final org.omg.CORBA.Object externalNameService = externalORB.resolve_initial_references("NameService");
            final NamingContextExt externalConnection = NamingContextExtHelper.narrow(externalNameService);
            final org.omg.CORBA.Object consumerName = externalConnection.resolve(
                    externalConnection.to_name(CONSUMER_NAME)
            );

            notificationIRP = NotificationIRPOperationsHelper.narrow(consumerName);

            final Properties localProperties = new Properties();
            localProperties.put("ORBInitRef.NameService", localIOR);

            final ORB localORB = ORB.init(new String[0], localProperties);

            localNameService = localORB.resolve_initial_references("NameService");

            subsid = notificationIRP.attach_push(localNameService, 0, CATEGORIES, FILTER);

            logger.info("subsId: "+subsid);
            logger.info("*** Corba connection succeeded ***");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}