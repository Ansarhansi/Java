package internal;

public class Garden {
    private int area;
    private int plants;

    public void setArea(int area) { this.area = area; }
    public void setPlants(int plants) { this.plants = plants; }

    public void grow() {
        System.out.println("Garden with area " + area + " sqm has " + plants + " plants.");
    }

    public String toString() {
        return "Garden{area=" + area + ", plants=" + plants + "}";
    }
}
