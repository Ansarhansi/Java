package internal;

public class Dessert {
    private String name;
    private boolean isSweet;

    public void setName(String name) { this.name = name; }
    public void setSweet(boolean sweet) { isSweet = sweet; }

    public void serve() {
        System.out.println("Serving " + (isSweet ? "sweet" : "savory") + " dessert: " + name);
    }

    public String toString() {
        return "Dessert{name='" + name + "', isSweet=" + isSweet + "}";
    }
}
