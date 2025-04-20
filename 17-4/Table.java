package Internal2;

import java.util.Objects;

public class Table {
    private String color;
    private int cost;
    private String brand;
    private double width;

    public Table(String color, int cost, String brand, double width) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.width = width;
    }

    public String toString() {
        return "Table{" + "color='" + color + '\'' + ", cost=" + cost + ", brand='" + brand + '\'' + ", width=" + width + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            if (Objects.equals(this.color, ((Table) obj).color) &&
                    Objects.equals(this.cost, ((Table) obj).cost)) {
                System.out.println("Table is matching...");
                return true;
            }
        }
        return false;
    }
}
