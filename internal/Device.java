package internal;

public class Device {
    private String model;
    private String brand;

    public Device(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void operate() {
        System.out.println("Device is operating");
    }

    public String toString() {
        return "Device{model='" + model + "', brand='" + brand + "'}";
    }
}
