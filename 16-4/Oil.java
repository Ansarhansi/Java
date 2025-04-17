package internal;

public class Oil {
    private String type;
    private double quantity;

    public Oil(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void refine() {
        System.out.println("Refining " + quantity + " liters of " + type + " oil.");
    }

    public String toString() {
        return "Oil{type='" + type + "', quantity=" + quantity + "}";
    }
}