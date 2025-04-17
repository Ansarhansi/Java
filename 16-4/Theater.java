package internal;

public class Theater {
    private String name;
    private int capacity;

    public Theater(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void showPerformance() {
        System.out.println(name + " theater is showcasing a performance with " + capacity + " seats.");
    }

    public String toString() {
        return "Theater{name='" + name + "', capacity=" + capacity + "}";
    }
}