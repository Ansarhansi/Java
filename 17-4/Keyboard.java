package Internal2;

import java.util.Objects;

public class Keyboard {
    private String color;
    private int cost;
    private String type;
    private double weight;

    public Keyboard(String color, int cost, String type, double weight) {
        this.color = color;
        this.cost = cost;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Keyboard{" + "color='" + color + '\'' + ", cost=" + cost + ", type='" + type + '\'' + ", weight=" + weight + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            if (Objects.equals(this.color, ((Keyboard) obj).color) &&
                    Objects.equals(this.cost, ((Keyboard) obj).cost)) {
                System.out.println("Keyboard is matching...");
                return true;
            }
        }
        return false;
    }
}
