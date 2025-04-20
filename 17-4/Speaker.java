package Internal2;

import java.util.Objects;

public class Speaker {
    private String color;
    private int cost;
    private String brand;
    private double watt;

    public Speaker(String color, int cost, String brand, double watt) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.watt = watt;
    }

    public String toString() {
        return "Speaker{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", watt=" + watt + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            if (Objects.equals(this.color, ((Speaker) obj).color) &&
                    Objects.equals(this.cost, ((Speaker) obj).cost)) {
                System.out.println("Speaker is matching...");
                return true;
            }
        }
        return false;
    }
}
