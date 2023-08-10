package com.nttdata.nifi.processors.enm;

import org.omg.AlarmIRPSystem.AlarmIRP;
import org.omg.AlarmIRPSystem.GetAlarmIRPNotificationProfile;
import org.omg.AlarmIRPSystem.GetAlarmIRPVersions;
import org.omg.ManagedGenericIRPSystem.InvalidParameter;

import java.lang.reflect.Field;
import java.security.InvalidParameterException;

public class AlarmClient implements Command {

    public void invoke(Arguments arguments) {

        if (null == arguments) {
            throw new InvalidParameterException("argument can not be null!");
        }

        if (!arguments.hasOption("o")) {
            System.out.println("operation is mandatory!");
            return;
        }

        AlarmIRP alarmIRPServant = null;
        ORBManager orbManager = ORBManager.I();

        try {
            String proxyInstanceId = arguments.getOption("piid");

            alarmIRPServant = orbManager.fetchAlarmServant(arguments);

            System.out.println("Got AlarmIRP!");
            String operation = arguments.getOption("o");
            System.out.println("Operation is: " + operation);

            if ("get_alarm_IRP_notification_profile".equalsIgnoreCase(operation)) {
                invoke_get_alarm_IRP_notification_profile(alarmIRPServant, arguments);
            } else {
                throw new InvalidParameterException("Not supported Operation! " + operation);
            }
        } catch (CorbaException e) {
            System.out.println("Got exception: " + e.getMessage());
        }

    }

    protected void invoke_get_alarm_IRP_notification_profile(AlarmIRP alarmIRPServant, Arguments arguments) {
        if (null == alarmIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }
        String[] versions = null;
        try {
            versions = alarmIRPServant.get_alarm_IRP_versions();

            for (String version : versions) {
                System.out.println("Version is: " + version);
            }

            System.out.println("operations successfully done!");
        } catch (GetAlarmIRPVersions getAlarmIRPVersions) {
            printErrorInfo(getAlarmIRPVersions);
        }

        try {
            alarmIRPServant.get_alarm_IRP_notification_profile(versions[0]);
        } catch (GetAlarmIRPNotificationProfile getAlarmIRPNotificationProfile) {
            printErrorInfo(getAlarmIRPNotificationProfile);
        } catch (org.omg.ManagedGenericIRPSystem.OperationNotSupported operationNotSupported) {
            printErrorInfo(operationNotSupported);
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        }

    }

    protected void printErrorInfo(Object obj) {
        Class cls = obj.getClass();

        System.out.println(cls.getName());

        for (Field filed : cls.getFields()) {
            try {
                System.out.println(filed.getName() + "---: " + filed.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


}
