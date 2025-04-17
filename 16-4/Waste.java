package internal;

public class Waste {
    private String type;
    private double quantity;

    public Waste(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void dispose() {
        System.out.println("Disposing of " + quantity + " kg of " + type + " waste.");
    }

    public String toString() {
        return "Waste{type='" + type + "', quantity=" + quantity + "}";
    }
}