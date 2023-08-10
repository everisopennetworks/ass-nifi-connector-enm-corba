package com.nttdata.nifi.processors.enm;

import org.omg.AlarmIRPSystem.AlarmIRP;
import org.omg.AlarmIRPSystem.AlarmIRPHelper;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.EPIRPSystem.EPIRP;
import org.omg.EPIRPSystem.EPIRPHelper;
import org.omg.NotificationIRPSystem.NotificationIRP;
import org.omg.NotificationIRPSystem.NotificationIRPHelper;
import org.omg.PortableGroup.GOA;
import org.omg.PortableGroup.GOAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

public class ORBManager {
    private ORB orb = ORB.init(new String[0], null);
    private static ORBManager orbManager;

    public static ORBManager I() {
        if (null == orbManager) {
            orbManager = new ORBManager();
        }

        return orbManager;
    }

    public GOA fetchPOAServant(Arguments arguments) {
        if (null == arguments) {
            return null;
        }
        //Object servant = this.orb.string_to_object(arguments.getOption("i"));

        GOA goa = null;
        try {
            goa = GOAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            goa.the_POAManager().activate();
        } catch (InvalidName | AdapterInactive invalidName) {
            invalidName.printStackTrace();
        }
        return goa;
    }

    public NotificationIRP fetchNotificationServant(Arguments arguments) {
        if (null == arguments) {
            return null;
        }

        Object servant = this.orb.string_to_object(arguments.getOption("i"));
        return NotificationIRPHelper.narrow(servant);
    }

    public AlarmIRP fetchAlarmServant(Arguments arguments) {
        if (null == arguments) {
            return null;
        }

        Object servant = this.orb.string_to_object(arguments.getOption("i"));
        return AlarmIRPHelper.narrow(servant);
    }

    public EPIRP fetchEPIRPServant(Arguments arguments) {
        if (null == arguments) {
            return null;
        }

        Object servant = this.orb.string_to_object(arguments.getOption("i"));
        return EPIRPHelper.narrow(servant);
    }

    public NotificationIRP fetchServantFromNameService(String proxyInstanceId) throws CorbaException {
        try {
            Object o = this.orb.resolve_initial_references("NameService");
            NamingContextExt nc = NamingContextExtHelper.narrow(o);

            NotificationIRP notificationIRP = NotificationIRPHelper.narrow(nc.resolve_str(proxyInstanceId));
            if (notificationIRP._non_existent()) {
                throw new CorbaException("Can not find NotificationIRP!");
            }

            return notificationIRP;
        } catch (InvalidName invalidName) {
            throw new CorbaException("Can not find NameService!");
        } catch (NotFound notFound) {
            throw new CorbaException("Can not find NotificationIRP!");
        } catch (CannotProceed cannotProceed) {
            throw new CorbaException("Can not find NotificationIRP!");
        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName invalidName) {
            throw new CorbaException("Can not find NotificationIRP!");
        }
    }
}

