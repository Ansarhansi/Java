package Internal2;

import java.util.Objects;

public class Glasses {
    private String color;
    private int cost;
    private String type;
    private String frameMaterial;

    public Glasses(String color, int cost, String type, String frameMaterial) {
        this.color = color;
        this.cost = cost;
        this.type = type;
        this.frameMaterial = frameMaterial;
    }

    public String toString() {
        return "Glasses{" + "color='" + color + '\'' + ", cost=" + cost + ", type='" + type + '\'' + ", frameMaterial='" + frameMaterial + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Glasses) {
            Glasses g = (Glasses) obj;
            if (Objects.equals(this.color, g.color) && this.cost == g.cost) {
                System.out.println("Glasses are matching...");
                return true;
            }
        }
        return false;
    }
}
