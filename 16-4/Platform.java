package internal;

public class Platform {
    private String name;
    private String type;

    public Platform(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayPlatform() {
        System.out.println(name + " is a " + type + " platform.");
    }

    public String toString() {
        return "Platform{name='" + name + "', type='" + type + "'}";
    }
}