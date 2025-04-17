package internal;

public class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void displayInfo() {
        System.out.println("Country: " + name);
    }

    public String toString() {
        return "Country{name='" + name + "', population=" + population + "}";
    }
}
