package internal;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }

    public String toString() {
        return "Vehicle{brand='" + brand + "', speed=" + speed + "}";
    }
}
