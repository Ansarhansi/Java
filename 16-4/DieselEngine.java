package internal;

class DieselEngine extends Engine {
    @Override
    public void describe() {
        System.out.println("This is a Diesel Engine.");
    }
    public void startEngine() {
        System.out.println("Diesel engine starting.");
    }
}