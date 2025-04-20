package Internal2;

import java.util.Objects;

public class WashingMachine {
    private String color;
    private int cost;
    private String model;
    private int capacity;

    public WashingMachine(String color, int cost, String model, int capacity) {
        this.color = color;
        this.cost = cost;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return "WashingMachine{" + "color='" + color + '\'' + ", cost=" + cost + ", model='" + model + '\'' + ", capacity=" + capacity + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof WashingMachine) {
            WashingMachine w = (WashingMachine) obj;
            if (Objects.equals(this.color, w.color) && this.cost == w.cost) {
                System.out.println("Washing Machine is matching...");
                return true;
            }
        }
        return false;
    }
}
