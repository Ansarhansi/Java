package internal;

public class App {
    private String name;
    private double version;

    public void setName(String name) { this.name = name; }
    public void setVersion(double version) { this.version = version; }

    public void run() {
        System.out.println("Running app: " + name);
    }

    public String toString() {
        return "App{name='" + name + "', version=" + version + "}";
    }
}
