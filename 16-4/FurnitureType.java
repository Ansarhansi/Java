package internal;

public class FurnitureType {
    private String type;
    private String material;

    public FurnitureType(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public void describe() {
        System.out.println(type + " is made of " + material);
    }

    public String toString() {
        return "FurnitureType{type='" + type + "', material='" + material + "'}";
    }
}