package Internal2;

import java.util.Objects;

public class Phone {
    private String color;
    private int cost;
    private String brand;
    private double screen;

    public Phone(String color, int cost, String brand, double screen) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.screen = screen;
    }

    public String toString() {
        return "Phone{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", screen=" + screen + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            if (Objects.equals(this.color, ((Phone) obj).color) &&
                    Objects.equals(this.cost, ((Phone) obj).cost)) {
                System.out.println("Phone is matching...");
                return true;
            }
        }
        return false;
    }
}
