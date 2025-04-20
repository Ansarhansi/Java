package Internal2;

import java.util.Objects;

public class Bag {
    private String color;
    private int cost;
    private String brand;
    private double weight;

    public Bag(String color, int cost, String brand, double weight) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.weight = weight;
    }

    public String toString() {
        return "Bag{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", weight=" + weight + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bag) {
            if (Objects.equals(this.color, ((Bag) obj).color) &&
                    Objects.equals(this.cost, ((Bag) obj).cost)) {
                System.out.println("Bag is matching...");
                return true;
            }
        }
        return false;
    }
}
