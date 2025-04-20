package Internal2;

import java.util.Objects;

public class Cushion {
    private String color;
    private int cost;
    private String material;
    private String size;

    public Cushion(String color, int cost, String material, String size) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.size = size;
    }

    public String toString() {
        return "Cushion{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", size='" + size + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cushion) {
            Cushion c = (Cushion) obj;
            if (Objects.equals(this.color, c.color) && this.cost == c.cost) {
                System.out.println("Cushion is matching...");
                return true;
            }
        }
        return false;
    }
}
