package Internal2;

import java.util.Objects;

public class Lamp {
    private String color;
    private int cost;
    private String brand;
    private double height;

    public Lamp(String color, int cost, String brand, double height) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.height = height;
    }

    public String toString() {
        return "Lamp{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", height=" + height + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            if (Objects.equals(this.color, ((Lamp) obj).color) &&
                    Objects.equals(this.cost, ((Lamp) obj).cost)) {
                System.out.println("Lamp is matching...");
                return true;
            }
        }
        return false;
    }
}
