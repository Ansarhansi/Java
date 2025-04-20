package Internal2;

import java.util.Objects;

public class Bottle {
    private String color;
    private int cost;
    private String material;
    private double capacity;

    public Bottle(String color, int cost, String material, double capacity) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bottle{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", capacity=" + capacity + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            if (Objects.equals(this.color, ((Bottle) obj).color) &&
                    Objects.equals(this.cost, ((Bottle) obj).cost)) {
                System.out.println("Bottle is matching...");
                return true;
            }
        }
        return false;
    }
}
