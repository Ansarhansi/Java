package internal;

class Smartphone1 extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("SmartPhone is powered on.");
    }
    public void takePhoto() {
        System.out.println("SmartPhone is taking a photo.");
    }
}