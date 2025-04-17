package internal;

public class Flower {
    private String color;
    private String type;

    public void setColor(String color) { this.color = color; }
    public void setType(String type) { this.type = type; }

    public void bloom() {
        System.out.println(type + " flower is blooming.");
    }

    public String toString() {
        return "Flower{type='" + type + "', color='" + color + "'}";
    }
}
