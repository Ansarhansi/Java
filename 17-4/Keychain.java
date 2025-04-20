package Internal2;

import java.util.Objects;

public class Keychain {
    private String color;
    private int cost;
    private String material;
    private double length;

    public Keychain(String color, int cost, String material, double length) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.length = length;
    }

    public String toString() {
        return "Keychain{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", length=" + length + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keychain) {
            Keychain k = (Keychain) obj;
            if (Objects.equals(this.color, k.color) && Objects.equals(this.cost, k.cost)) {
                System.out.println("Keychain is matching...");
                return true;
            }
        }
        return false;
    }
}
