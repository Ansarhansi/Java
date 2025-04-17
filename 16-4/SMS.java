package internal;

class SMS extends Notification {
    @Override
    public void describe() {
        System.out.println("This is an SMS Notification.");
    }
    public void sendSMS() {
        System.out.println("Sending SMS.");
    }
}