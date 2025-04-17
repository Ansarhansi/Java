package internal;

public class Appliance {
    private String type;
    private int wattage;

    public void setType(String type) { this.type = type; }
    public void setWattage(int wattage) { this.wattage = wattage; }

    public void use() {
        System.out.println("Appliance is in use");
    }

    public String toString() {
        return "Appliance{type='" + type + "', wattage=" + wattage + "W}";
    }
}
