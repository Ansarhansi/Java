package internal;

public class Market {
    private String name;
    private String location;

    public Market(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void openMarket() {
        System.out.println("The " + name + " market is located in " + location + " and is now open.");
    }

    public String toString() {
        return "Market{name='" + name + "', location='" + location + "'}";
    }
}
