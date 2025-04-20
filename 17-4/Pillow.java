package Internal2;

import java.util.Objects;

public class Pillow {
    private String color;
    private int cost;
    private String material;
    private double softness;

    public Pillow(String color, int cost, String material, double softness) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.softness = softness;
    }

    public String toString() {
        return "Pillow{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", softness=" + softness + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pillow) {
            Pillow p = (Pillow) obj;
            if (Objects.equals(this.color, p.color) && Objects.equals(this.cost, p.cost)) {
                System.out.println("Pillow is matching...");
                return true;
            }
        }
        return false;
    }
}
