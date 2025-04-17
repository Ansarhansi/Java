package internal;

public class Restaurant {
    private String name;
    private String cuisine;

    public void setName(String name) { this.name = name; }
    public void setCuisine(String cuisine) { this.cuisine = cuisine; }

    public void serveFood() {
        System.out.println(name + " serves " + cuisine + " cuisine");
    }

    public String toString() {
        return "Restaurant{name='" + name + "', cuisine='" + cuisine + "'}";
    }
}
