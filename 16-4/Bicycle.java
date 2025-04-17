package internal;

class Bicycle extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a Bicycle.");
    }
    public void pedal() {
        System.out.println("Pedaling the Bicycle.");
    }
}