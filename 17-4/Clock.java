package Internal2;

import java.util.Objects;

public class Clock {
    private String color;
    private int cost;
    private String brand;
    private double radius;

    public Clock(String color, int cost, String brand, double radius) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.radius = radius;
    }

    public String toString() {
        return "Clock{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", radius=" + radius + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clock) {
            if (Objects.equals(this.color, ((Clock) obj).color) &&
                    Objects.equals(this.cost, ((Clock) obj).cost)) {
                System.out.println("Clock is matching...");
                return true;
            }
        }
        return false;
    }
}
