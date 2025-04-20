package Internal2;

import java.util.Objects;

public class Laptop {
    private String color;
    private int cost;
    private String brand;
    private double screenSize;

    public Laptop(String color, int cost, String brand, double screenSize) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Laptop{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", screenSize=" + screenSize + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            if (Objects.equals(this.color, ((Laptop) obj).color) &&
                    Objects.equals(this.cost, ((Laptop) obj).cost)) {
                System.out.println("Laptop is matching...");
                return true;
            }
        }
        return false;
    }
}
