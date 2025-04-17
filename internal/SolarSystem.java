package internal;

public class SolarSystem {
    private String name;
    private int planets;

    public SolarSystem(String name, int planets) {
        this.name = name;
        this.planets = planets;
    }

    public void explore() {
        System.out.println("Exploring the " + name + " solar system with " + planets + " planets.");
    }

    public String toString() {
        return "SolarSystem{name='" + name + "', planets=" + planets + "}";
    }
}
