package internal;

class Refrigerator extends Appliance {
    @Override
    public void describe() {
        System.out.println("This is a Refrigerator, used to keep food cool.");
    }
    public void cool() {
        System.out.println("Refrigerator is cooling.");
    }
}