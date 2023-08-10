package com.nttdata.nifi.processors.enm;

import org.omg.CORBA.IntHolder;
import org.omg.ManagedGenericIRPConstDefs.Method;
import org.omg.ManagedGenericIRPConstDefs.StringTypeOpt;
import org.omg.ManagedGenericIRPConstDefs.StringTypeOptHolder;
import org.omg.ManagedGenericIRPSystem.InvalidParameter;
import org.omg.ManagedGenericIRPSystem.OperationNotSupported;
import org.omg.ManagedGenericIRPSystem.ParameterNotSupported;
import org.omg.NotificationIRPConstDefs.NotificationTypesSetHolder;
import org.omg.NotificationIRPConstDefs.SubscriptionStateHolder;
import org.omg.NotificationIRPSystem.*;

import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class NotificationClient implements Command {
    public void invoke(Arguments arguments) {

        if (null == arguments) {
            throw new InvalidParameterException("argument can not be null!");
        }

        if (!arguments.hasOption("o")) {
            System.out.println("operation is mandatory!");
            return;
        }

        NotificationIRP notificationIRPServant = null;
        ORBManager orbManager = ORBManager.I();

        try {
            String proxyInstanceId = arguments.getOption("piid");
            if (!arguments.hasOption("i")) {
                System.out.println("Getting NotificationIRP from local name service!");
                notificationIRPServant = orbManager.fetchServantFromNameService(proxyInstanceId);
            } else {
                notificationIRPServant = orbManager.fetchNotificationServant(arguments);
            }

            System.out.println("Got NotificationIRP!");
            String operation = arguments.getOption("o");
            System.out.println("Operation is: " + operation);

            if ("attach_push".equalsIgnoreCase(operation)) {
                invoke_attach_push(notificationIRPServant, arguments);
            } else if ("detach".equalsIgnoreCase(operation)) {
                invoke_detach(notificationIRPServant, arguments);
            } else if ("get_subscription_ids".equalsIgnoreCase(operation)) {
                invoke_get_subscription_ids(notificationIRPServant, arguments);
            } else if ("get_IRP_versions".equalsIgnoreCase(operation)) {
                invoke_get_notification_irp_version(notificationIRPServant);
            } else if ("get_notification_categories".equalsIgnoreCase(operation)) {
                invoke_get_notification_categories(notificationIRPServant);
            } else if ("change_subscription_filter".equalsIgnoreCase(operation)) {
                invoke_change_subscription_filter(notificationIRPServant, arguments);
            } else if ("get_subscription_status".equalsIgnoreCase(operation)) {
                invoke_get_subscription_status(notificationIRPServant, arguments);
            } else if ("get_notification_profile".equalsIgnoreCase(operation)) {
                invoke_get_notification_profile(notificationIRPServant, arguments);
            } else if ("get_operation_profile".equalsIgnoreCase(operation)) {
                invoke_get_operation_profile(notificationIRPServant, arguments);
            } else {
                throw new InvalidParameterException("Not supported Operation! " + operation);
            }
        } catch (CorbaException e) {
            System.out.println("Got exception: " + e.getMessage());
        }
    }

    protected void invoke_get_operation_profile(NotificationIRP notificationIRPServant, Arguments arguments) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        String irpVersion = "";

        if (!arguments.hasOption("v")) {
            System.out.println("irp version is mandatory!");

            return;
        }
        irpVersion = arguments.getOption("v");

        try {
            Method[] methods = notificationIRPServant.get_notification_IRP_operations_profile(irpVersion);

            for (Method method : methods) {
                System.out.println("Method name: " + method.name + " {");

                for (String param : method.parameter_list) {
                    System.out.println("parameter name: " + param);
                }

                System.out.println("}");
            }

            System.out.println("operation successfully done!");
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        } catch (GetNotificationIRPOperationsProfile getNotificationIRPOperationsProfile) {
            printErrorInfo(getNotificationIRPOperationsProfile);
        }
    }

    protected void invoke_get_notification_profile(NotificationIRP notificationIRPServant, Arguments arguments) {
        String irpVersion = "";

        if (!arguments.hasOption("v")) {
            System.out.println("irp version is mandatory!");

            return;
        }
        irpVersion = arguments.getOption("v");

        try {
            Method[] methods = notificationIRPServant.get_notification_IRP_notification_profile(irpVersion);

            System.out.println("Return:");
            for (Method method : methods) {
                System.out.println("Method name: " + method.name + " {");

                for (String param : method.parameter_list) {
                    System.out.println("parameter name: " + param);
                }

                System.out.println("}");
            }

            System.out.println("operation successfully done!");
        } catch (GetNotificationIRPNotificationProfile getNotificationIRPNotificationProfile) {
            printErrorInfo(getNotificationIRPNotificationProfile);
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        }
    }

    protected void invoke_get_subscription_status(NotificationIRP notificationIRPServant, Arguments arguments) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        String subscriptionId = "";

        if (!arguments.hasOption("sid")) {
            System.out.println("subscription_id is mandatory!");

            return;
        }
        subscriptionId = arguments.getOption("sid");
        System.out.println("SubscriptionId is: " + subscriptionId);

        StringTypeOptHolder filter = new StringTypeOptHolder();
        SubscriptionStateHolder state = new SubscriptionStateHolder();
        IntHolder timeTick = new IntHolder();
        try {
            notificationIRPServant.get_subscription_status(subscriptionId, filter, state, timeTick);

            System.out.println("Return:");
            StringTypeOpt filterValue = filter.value;
            StringBuffer filterString = new StringBuffer(filterValue.getClass().getName() + " : ");
            if (filterValue.discriminator()) {
                filterString.append(filterValue.value());
            } else {
                filterString.append("not_used 0");
            }


            System.out.println("filter: " + filterString);
            System.out.println("state :" + state.value);
            System.out.println("timeTick :" + timeTick.value);
            System.out.println("operation successfully done!");
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        } catch (GetSubscriptionStatus getSubscriptionStatus) {
            printErrorInfo(getSubscriptionStatus);
        }
    }

    protected void invoke_change_subscription_filter(NotificationIRP notificationIRPServant, Arguments arguments) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        String filter = "";


        if (!arguments.hasOption("sid")) {
            System.out.println("subscription_id is mandatory!");
            return;
        }
        String subscriptionId = arguments.getOption("sid");
        System.out.println("SubscriptionId is: " + subscriptionId);

        if (arguments.hasOption("f")) {
            filter = arguments.getOption("f");
        }
        System.out.println("filter is: " + filter);

        try {
            notificationIRPServant.change_subscription_filter(subscriptionId, filter);

            System.out.println("operation successfully done!");
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        } catch (ChangeSubscriptionFilter changeSubscriptionFilter) {
            printErrorInfo(changeSubscriptionFilter);
        }
    }


    protected void invoke_get_notification_categories(NotificationIRP notificationIRPServant) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        NotificationTypesSetHolder notification_type_list = new NotificationTypesSetHolder();

        try {
            String[] categories = notificationIRPServant.get_notification_categories(notification_type_list);

            for (String category : categories) {
                System.out.println("category: " + category);
            }
        } catch (GetNotificationCategories getNotificationCategories) {
            printErrorInfo(getNotificationCategories);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        }
    }


    protected void invoke_get_notification_irp_version(NotificationIRP notificationIRPServant) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        try {
            String[] versions = notificationIRPServant.get_notification_IRP_versions();

            for (String version : versions) {
                System.out.println("Version is: " + version);
            }

            System.out.println("operations successfully done!");
        } catch (GetNotificationIRPVersions getNotificationIRPVersions) {
            printErrorInfo(getNotificationIRPVersions);
        }
    }

    protected void invoke_get_subscription_ids(NotificationIRP notificationIRPServant, Arguments arguments) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        if (null == arguments) {
            throw new InvalidParameterException("arguments can not be null!");
        }

        String mr = "";
        if (arguments.hasOption("mr")) {
            mr = arguments.getOption("mr");
        }

        try {
            String[] subscriptionIds = notificationIRPServant.get_subscription_ids(mr);
            System.out.println("Return successfully!");
            for (String id : subscriptionIds) {
                System.out.println("subscriptionId:" + id);
            }
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (OperationNotSupported operationNotSupported) {
            operationNotSupported.printStackTrace();
        } catch (GetSubscriptionIds getSubscriptionIds) {
            printErrorInfo(getSubscriptionIds);
        }
    }

    protected void invoke_detach(NotificationIRP notificationIRPServant, Arguments arguments) {
        if (null == notificationIRPServant) {
            throw new InvalidParameterException("Can not get Servant!");
        }

        if (null == arguments) {
            throw new InvalidParameterException("arguments can not be null!");
        }

        String mr = "";
        if (arguments.hasOption("mr")) {
            mr = arguments.getOption("mr");
        }
        System.out.println("manager IOR is:");
        System.out.println(mr);

        String subscriptionId = "";
        if (arguments.hasOption("sid")) {
            subscriptionId = arguments.getOption("sid");
        }
        subscriptionId = "1";
        System.out.println("subscriptionId:");
        System.out.println(subscriptionId);

        try {
            notificationIRPServant.detach(mr, subscriptionId);
            System.out.println("Return");
            System.out.println("Detach successfully!");
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
        } catch (DetachException e) {
            printErrorInfo(e);
        } catch (ParameterNotSupported parameterNotSupported) {
            printErrorInfo(parameterNotSupported);
        }
    }

    protected void invoke_attach_push(NotificationIRP notificationIRPServant, Arguments arguments) {
        String mr = "";
        if (arguments.hasOption("mr")) {
            mr = arguments.getOption("mr");
        }

        int timeTick = 0;
        if (arguments.hasOption("t")) {
            String tickString = arguments.getOption("t");
            timeTick = Integer.parseInt(tickString);
        }
        System.out.println("time tick is: " + timeTick);

        String categoryString = "";
        if (arguments.hasOption("categories")) {
            categoryString = arguments.getOption("categories");
        }
        System.out.println("category is: " + categoryString);
        String[] categories = initCategories(categoryString);

        String filter = "";

        /*if (arguments.hasOption("f")) {
            String filterString = arguments.getOption("f");
            filter.value(filterString);
        }else{
            filter._default();
        }*/

        try {
            org.omg.CORBA.Object ob = null;
            String subscriptionId = notificationIRPServant.attach_push(ob, timeTick, categories, filter);
            System.out.println("Return");
            System.out.println("subscriptionId is: " + subscriptionId);
        } catch (AlreadySubscribed alreadySubscribed) {
            System.out.println(alreadySubscribed.getMessage());
            alreadySubscribed.printStackTrace();
        } catch (InvalidParameter invalidParameter) {
            printErrorInfo(invalidParameter);
            invalidParameter.printStackTrace();
        } catch (Attach attach) {
            printErrorInfo(attach);
            attach.printStackTrace();
        } catch (AtLeastOneNotificationCategoryNotSupported atLeastOneNotificationCategoryNotSupported) {
            System.out.println(atLeastOneNotificationCategoryNotSupported.getMessage());
            atLeastOneNotificationCategoryNotSupported.printStackTrace();
        } catch (ParameterNotSupported parameterNotSupported) {
            printErrorInfo(parameterNotSupported);
            parameterNotSupported.printStackTrace();
        }
    }

    protected String[] initCategories(String categoryString) {
        if (null == categoryString || "".endsWith(categoryString)) {
            return new String[0];
        }

        List<String> categories = splitWithSpecialChar(categoryString, ",");

        return (String[]) categories.toArray(new String[0]);
    }

    protected List<String> splitWithSpecialChar(String source, String splitter) {
        List<String> results = new ArrayList<String>();

        if (null == source || null == splitter) {
            return results;
        }

        if ("".equals(source)) {
            results.add(source);
            return results;
        }

        if ("".equals(splitter)) {
            results.add(source);
            return results;
        }

        while (source.length() > 0) {
            int index = source.indexOf(splitter);

            if (index == -1) {
                results.add(source);

                break;
            }
            String sub = source.substring(0, index);
            results.add(sub);

            if (index == source.length() - splitter.length()) {
                break;
            }

            source = source.substring(index + splitter.length());
        }

        return results;
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
