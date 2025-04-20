package Internal2;

import java.util.Objects;

public class TV {
    private String color;
    private int cost;
    private String brand;
    private double screenSize;

    public TV(String color, int cost, String brand, double screenSize) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "TV{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", screenSize=" + screenSize + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TV) {
            if (Objects.equals(this.color, ((TV) obj).color) &&
                    Objects.equals(this.cost, ((TV) obj).cost)) {
                System.out.println("TV is matching...");
                return true;
            }
        }
        return false;
    }
}
