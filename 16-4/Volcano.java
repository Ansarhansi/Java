package internal;

public class Volcano {
    private String name;
    private String status;

    public Volcano(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void erupt() {
        System.out.println(name + " volcano is " + status + " and might erupt.");
    }

    public String toString() {
        return "Volcano{name='" + name + "', status='" + status + "'}";
    }
}