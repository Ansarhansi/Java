package Internal2;

import java.util.Objects;

public class Telescope {
    private String color;
    private int cost;
    private double magnification;
    private String brand;

    public Telescope(String color, int cost, double magnification, String brand) {
        this.color = color;
        this.cost = cost;
        this.magnification = magnification;
        this.brand = brand;
    }

    public String toString() {
        return "Telescope{" + "color='" + color + '\'' + ", cost=" + cost + ", magnification=" + magnification + ", brand='" + brand + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Telescope) {
            Telescope t = (Telescope) obj;
            if (Objects.equals(this.color, t.color) && this.cost == t.cost) {
                System.out.println("Telescope is matching...");
                return true;
            }
        }
        return false;
    }
}
