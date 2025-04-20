package Internal2;

import java.util.Objects;

public class Smartphone {
    private String brand;
    private int cost;
    private double screenSize;
    private int batteryCapacity;

    public Smartphone(String brand, int cost, double screenSize, int batteryCapacity) {
        this.brand = brand;
        this.cost = cost;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    public String toString() {
        return "Smartphone{" + "brand='" + brand + '\'' + ", cost=" + cost + ", screenSize=" + screenSize + ", batteryCapacity=" + batteryCapacity + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Smartphone) {
            Smartphone s = (Smartphone) obj;
            if (Objects.equals(this.brand, s.brand) && this.cost == s.cost) {
                System.out.println("Smartphone is matching...");
                return true;
            }
        }
        return false;
    }
}
