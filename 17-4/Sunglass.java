package Internal2;

import java.util.Objects;

public class Sunglass {
    private String color;
    private int cost;
    private String brand;
    private boolean uvProtection;

    public Sunglass(String color, int cost, String brand, boolean uvProtection) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.uvProtection = uvProtection;
    }

    public String toString() {
        return "Sunglass{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", uvProtection=" + uvProtection + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sunglass) {
            Sunglass s = (Sunglass) obj;
            if (Objects.equals(this.color, s.color) && Objects.equals(this.cost, s.cost)) {
                System.out.println("Sunglass is matching...");
                return true;
            }
        }
        return false;
    }
}
