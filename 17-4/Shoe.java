package Internal2;

import java.util.Objects;

public class Shoe {
    private String color;
    private int cost;
    private String brand;
    private int size;

    public Shoe(String color, int cost, String brand, int size) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.size = size;
    }

    public String toString() {
        return "Shoe{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", size=" + size + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            if (Objects.equals(this.color, ((Shoe) obj).color) &&
                    Objects.equals(this.cost, ((Shoe) obj).cost)) {
                System.out.println("Shoe is matching...");
                return true;
            }
        }
        return false;
    }
}
