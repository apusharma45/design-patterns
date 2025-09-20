package factory;

class NotificationFactory {
    SMSNotification sms;
    EmailNotification email;
    void sendMessage(int type) {
        if(type == 1) {
            sms = new SMSNotification();
            sms.notifyUser();
        }
        else if(type == 2 ) {
            email = new EmailNotification();
            email.notifyUser();
        }
        else {
            System.out.println("invalid option");
        }
    }
}
