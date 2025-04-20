package Internal2;

import java.util.Objects;

public class Fan {
    private String color;
    private int cost;
    private String brand;
    private double speed;

    public Fan(String color, int cost, String brand, double speed) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.speed = speed;
    }

    public String toString() {
        return "Fan{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", speed=" + speed + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            if (Objects.equals(this.color, ((Fan) obj).color) &&
                    Objects.equals(this.cost, ((Fan) obj).cost)) {
                System.out.println("Fan is matching...");
                return true;
            }
        }
        return false;
    }
}
