package internal;

public class Decoration {
    private String type;
    private String color;

    public Decoration(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void decorate() {
        System.out.println("Decorating with " + type + " in " + color + " color.");
    }

    public String toString() {
        return "Decoration{type='" + type + "', color='" + color + "'}";
    }
}