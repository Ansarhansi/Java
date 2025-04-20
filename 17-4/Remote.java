package Internal2;

import java.util.Objects;

public class Remote {
    private String color;
    private int cost;
    private String company;
    private double range;

    public Remote(String color, int cost, String company, double range) {
        this.color = color;
        this.cost = cost;
        this.company = company;
        this.range = range;
    }

    public String toString() {
        return "Remote{" + "color='" + color + '\'' + ", cost=" + cost + ", company='" + company + '\'' + ", range=" + range + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Remote) {
            if (Objects.equals(this.color, ((Remote) obj).color) &&
                    Objects.equals(this.cost, ((Remote) obj).cost)) {
                System.out.println("Remote is matching...");
                return true;
            }
        }
        return false;
    }
}
