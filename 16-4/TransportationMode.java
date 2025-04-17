public class TransportationMode {
    private String mode;
    private int capacity;

    public TransportationMode(String mode, int capacity) {
        this.mode = mode;
        this.capacity = capacity;
    }

    public void travel() {
        System.out.println("Traveling by " + mode + " with a capacity of " + capacity + " passengers.");
    }

    public String toString() {
        return "TransportationMode{mode='" + mode + "', capacity=" + capacity + "}";
    }
}