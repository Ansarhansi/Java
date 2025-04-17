package internal;

class WashingMachine extends Machine {
    @Override
    public void describe() {
        System.out.println("This is a Washing Machine.");
    }
    public void washClothes() {
        System.out.println("Washing clothes.");
    }
}