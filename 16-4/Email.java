package internal;

class Email extends Message {
    @Override
    public void describe() {
        System.out.println("This is an Email message.");
    }
    public void sendEmail() {
        System.out.println("Sending Email.");
    }
}
