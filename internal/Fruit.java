package internal;

public class Fruit {
    private String name;
    private String color;

    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }

    public void taste() {
        System.out.println("Fruit tastes sweet");
    }

    public String toString() {
        return "Fruit{name='" + name + "', color='" + color + "'}";
    }
}
