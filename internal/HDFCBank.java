package internal;

class HDFCBank extends Bank {
    @Override
    public void describe() {
        System.out.println("This is HDFC Bank.");
    }
    public void offerLoan() {
        System.out.println("HDFC offering a loan.");
    }
}