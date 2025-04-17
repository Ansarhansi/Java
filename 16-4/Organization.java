package internal;

public class Organization {
    private String name;
    private String type;

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }

    public void operate() {
        System.out.println(name + " is operating as a " + type);
    }

    public String toString() {
        return "Organization{name='" + name + "', type='" + type + "'}";
    }
}
