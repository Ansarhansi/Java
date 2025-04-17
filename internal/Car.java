package internal;

class Car extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a Car, used for transportation.");
    }
    public void drive() {
        System.out.println("Car is driving.");
    }
}
