package Internal2;

import java.util.Objects;

public class Mouse {
    private String color;
    private int cost;
    private String brand;
    private double dpi;

    public Mouse(String color, int cost, String brand, double dpi) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.dpi = dpi;
    }

    public String toString() {
        return "Mouse{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", dpi=" + dpi + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            if (Objects.equals(this.color, ((Mouse) obj).color) &&
                    Objects.equals(this.cost, ((Mouse) obj).cost)) {
                System.out.println("Mouse is matching...");
                return true;
            }
        }
        return false;
    }
}
