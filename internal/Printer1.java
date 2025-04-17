package internal;

public class Printer1 {
    private String brand;
    private boolean isColor;

    public void setBrand(String brand) { this.brand = brand; }
    public void setColor(boolean color) { isColor = color; }

    public void print() {
        System.out.println("Printing using " + (isColor ? "color" : "B/W") + " printer: " + brand);
    }

    public String toString() {
        return "Printer{brand='" + brand + "', isColor=" + isColor + "}";
    }
}
