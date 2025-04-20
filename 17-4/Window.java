package Internal2;

import java.util.Objects;

public class Window {
    private String color;
    private int cost;
    private String material;
    private double height;

    public Window(String color, int cost, String material, double height) {
        this.color = color;
        this.cost = cost;
        this.material = material;
        this.height = height;
    }

    public String toString() {
        return "Window{" + "color='" + color + '\'' + ", cost=" + cost + ", material='" + material + '\'' + ", height=" + height + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Window) {
            if (Objects.equals(this.color, ((Window) obj).color) &&
                    Objects.equals(this.cost, ((Window) obj).cost)) {
                System.out.println("Window is matching...");
                return true;
            }
        }
        return false;
    }
}
