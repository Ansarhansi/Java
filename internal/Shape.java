package internal;

public class Shape {
    private String type;
    private int sides;

    public Shape(String type, int sides) {
        this.type = type;
        this.sides = sides;
    }

    public void draw() {
        System.out.println("Shape is being drawn");
    }

    public String toString() {
        return "Shape{type='" + type + "', sides=" + sides + "}";
    }
}
