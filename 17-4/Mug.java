package Internal2;

import java.util.Objects;

public class Mug {
    private String color;
    private int cost;
    private String type;
    private double capacity;

    public Mug(String color, int cost, String type, double capacity) {
        this.color = color;
        this.cost = cost;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "Mug{" + "color='" + color + '\'' + ", cost=" + cost + ", type='" + type + '\'' + ", capacity=" + capacity + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mug) {
            Mug m = (Mug) obj;
            if (Objects.equals(this.color, m.color) && Objects.equals(this.cost, m.cost)) {
                System.out.println("Mug is matching...");
                return true;
            }
        }
        return false;
    }
}
