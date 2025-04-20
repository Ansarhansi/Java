package Internal2;

import java.util.Objects;

public class Notebook {
    private String color;
    private int cost;
    private int pages;
    private double thickness;

    public Notebook(String color, int cost, int pages, double thickness) {
        this.color = color;
        this.cost = cost;
        this.pages = pages;
        this.thickness = thickness;
    }

    public String toString() {
        return "Notebook{" + "color='" + color + '\'' + ", cost=" + cost + ", pages=" + pages + ", thickness=" + thickness + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Notebook) {
            Notebook n = (Notebook) obj;
            if (Objects.equals(this.color, n.color) && Objects.equals(this.cost, n.cost)) {
                System.out.println("Notebook is matching...");
                return true;
            }
        }
        return false;
    }
}
