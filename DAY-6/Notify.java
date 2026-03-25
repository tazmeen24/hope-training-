class Notification{
    void send(){

    }
}

class EmailNotification extends Notification{
    void send(){
        System.out.println("Email Notification Sent");
    }
    void changeEmail(){
        System.out.println("Email Changed");
    }
}

class SMSNotification extends Notification{
    void send(){
        System.out.println("SMS Notification Sent");
    }
}

public class Notify {
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotification();
        n.send();
        n = new SMSNotification();
        n.send();
    }
}