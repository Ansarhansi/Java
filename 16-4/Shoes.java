package internal;

public class Shoes {
    private String brand;
    private int size;

    public void setBrand(String brand) { this.brand = brand; }
    public void setSize(int size) { this.size = size; }

    public void wear() {
        System.out.println("Wearing " + brand + " shoes of size " + size);
    }

    public String toString() {
        return "Shoes{brand='" + brand + "', size=" + size + "}";
    }
}
