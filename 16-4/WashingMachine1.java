package internal;

class WashingMachine1 extends HomeAppliance {
    @Override
    public void operate() {
        System.out.println("Washing machine is washing clothes.");
    }
    public void setCycle() {
        System.out.println("Washing machine cycle is being set.");
    }
}