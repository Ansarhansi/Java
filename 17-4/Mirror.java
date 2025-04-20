package Internal2;

import java.util.Objects;

public class Mirror {
    private String color;
    private int cost;
    private String shape;
    private double height;

    public Mirror(String color, int cost, String shape, double height) {
        this.color = color;
        this.cost = cost;
        this.shape = shape;
        this.height = height;
    }

    public String toString() {
        return "Mirror{" + "color='" + color + '\'' + ", cost=" + cost + ", shape='" + shape + '\'' + ", height=" + height + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mirror) {
            if (Objects.equals(this.color, ((Mirror) obj).color) &&
                    Objects.equals(this.cost, ((Mirror) obj).cost)) {
                System.out.println("Mirror is matching...");
                return true;
            }
        }
        return false;
    }
}
