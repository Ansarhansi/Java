package internal;

public class Furniture {
    private String type;
    private String material;

    public void setType(String type) { this.type = type; }
    public void setMaterial(String material) { this.material = material; }

    public void place() {
        System.out.println("Placing " + material + " " + type);
    }

    public String toString() {
        return "Furniture{type='" + type + "', material='" + material + "'}";
    }
}
