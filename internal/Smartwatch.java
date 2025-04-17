package internal;

class Smartwatch extends Gadget {
    @Override
    public void describe() {
        System.out.println("This is a Smartwatch.");
    }
    public void trackSteps() {
        System.out.println("Tracking steps using Smartwatch.");
    }
}