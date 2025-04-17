package internal;

public class City {
    private String name;
    private long population;

    public void setName(String name) { this.name = name; }
    public void setPopulation(long population) { this.population = population; }

    public void grow() {
        System.out.println(name + " is growing in population.");
    }

    public String toString() {
        return "City{name='" + name + "', population=" + population + "}";
    }
}
