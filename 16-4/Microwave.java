package internal;

class Microwave extends Appliance {
    @Override
    public void describe() {
        System.out.println("This is a Microwave Oven.");
    }
    public void heatFood() {
        System.out.println("Heating food in Microwave.");
    }
}