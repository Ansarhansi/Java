package internal;

public class Building {
    private String type;
    private int floors;

    public Building(String type, int floors) {
        this.type = type;
        this.floors = floors;
    }

    public void construct() {
        System.out.println("Constructing a " + floors + "-floor " + type);
    }

    public String toString() {
        return "Building{type='" + type + "', floors=" + floors + "}";
    }
}
