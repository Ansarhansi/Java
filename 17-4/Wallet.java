package Internal2;

import java.util.Objects;

public class Wallet {
    private String color;
    private int cost;
    private String material;
    private double length;

    public Wallet(String color, int cost, String material, double length) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.length = length;
    }

    public String toString() {
        return "Wallet{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", length=" + length + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wallet) {
            Wallet w = (Wallet) obj;
            if (Objects.equals(this.color, w.color) &&
                    Objects.equals(this.cost, w.cost)) {
                System.out.println("Wallet is matching...");
                return true;
            }
        }
        return false;
    }
}
