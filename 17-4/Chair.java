package Internal2;

import java.util.Objects;

public class Chair {
    private String color;
    private int cost;
    private String brand;
    private double weight;

    public Chair(String color, int cost, String brand, double weight) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.weight = weight;
    }

    public String toString() {
        return "Chair{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", weight=" + weight + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            if (Objects.equals(this.color, ((Chair) obj).color) &&
                    Objects.equals(this.cost, ((Chair) obj).cost)) {
                System.out.println("Chair is matching...");
                return true;
            }
        }
        return false;
    }
}
