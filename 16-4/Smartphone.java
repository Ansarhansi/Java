package internal;

class Smartphone extends Device {
    @Override
    public void describe() {
        System.out.println("This is a Smartphone, a handheld device.");
    }
    public void call() {
        System.out.println("Smartphone is making a call.");
    }
}
