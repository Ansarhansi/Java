package internal;

public class Currency1 {
    private String name;
    private String country;

    public void setName(String name) { this.name = name; }
    public void setCountry(String country) { this.country = country; }

    public void printInfo() {
        System.out.println(name + " is the currency of " + country);
    }

    public String toString() {
        return "Currency{name='" + name + "', country='" + country + "'}";
    }
}
