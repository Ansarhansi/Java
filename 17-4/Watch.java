package Internal2;

import java.util.Objects;

public class Watch {
    private String color;
    private int cost;
    private String brand;
    private double dialSize;

    public Watch(String color, int cost, String brand, double dialSize) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.dialSize = dialSize;
    }

    public String toString() {
        return "Watch{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", dialSize=" + dialSize + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            if (Objects.equals(this.color, ((Watch) obj).color) &&
                    Objects.equals(this.cost, ((Watch) obj).cost)) {
                System.out.println("Watch is matching...");
                return true;
            }
        }
        return false;
    }
}
