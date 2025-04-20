package Internal2;

import java.util.Objects;

public class Helmet {
    private String color;
    private int cost;
    private String brand;
    private double weight;

    public Helmet(String color, int cost, String brand, double weight) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.weight = weight;
    }

    public String toString() {
        return "Helmet{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", weight=" + weight + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet h = (Helmet) obj;
            if (Objects.equals(this.color, h.color) && Objects.equals(this.cost, h.cost)) {
                System.out.println("Helmet is matching...");
                return true;
            }
        }
        return false;
    }
}
