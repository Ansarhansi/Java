package Internal2;

import java.util.Objects;

public class Pen {
    private String color;
    private int cost;
    private String brand;
    private double length;

    public Pen(String color, int cost, String brand, double length) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Pen) {
            Pen pen = (Pen) anything;
            if (Objects.equals(this.color, pen.color) &&
                    Objects.equals(this.cost, pen.cost)) {
                System.out.println("Pen is matching...");
                return true;
            }
        }
        return false;
    }
}
