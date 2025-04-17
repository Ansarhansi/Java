package internal;

public class SeaCreature {
    private String name;
    private boolean isVenomous;

    public void setName(String name) { this.name = name; }
    public void setIsVenomous(boolean isVenomous) { this.isVenomous = isVenomous; }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public String toString() {
        return "SeaCreature{name='" + name + "', isVenomous=" + isVenomous + "}";
    }
}
