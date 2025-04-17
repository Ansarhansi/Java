package internal;

public class Room {
    private String name;
    private int area;

    public void setName(String name) { this.name = name; }
    public void setArea(int area) { this.area = area; }

    public void clean() {
        System.out.println("Cleaning " + name);
    }

    public String toString() {
        return "Room{name='" + name + "', area=" + area + "sqft}";
    }
}
