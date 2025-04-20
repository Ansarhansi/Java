package Internal2;

import java.util.Objects;

public class Fridge {
    private String color;
    private int cost;
    private String brand;
    private double capacity;

    public Fridge(String color, int cost, String brand, double capacity) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.capacity = capacity;
    }

    public String toString() {
        return "Fridge{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", capacity=" + capacity + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fridge) {
            Fridge f = (Fridge) obj;
            if (Objects.equals(this.color, f.color) && this.cost == f.cost) {
                System.out.println("Fridge is matching...");
                return true;
            }
        }
        return false;
    }
}
