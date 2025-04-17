package internal;

class EmailNotification extends Notification1 {
    @Override
    public void send() {
        System.out.println("Sending email notification.");
    }

    public void attachFile() {
        System.out.println("Attaching file to email.");
    }
}
