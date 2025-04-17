package internal;

public class ModeOfTransport {
    private String mode;
    private int capacity;

    public void setMode(String mode) { this.mode = mode; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public void move() {
        System.out.println(mode + " is moving with capacity " + capacity);
    }

    public String toString() {
        return "ModeOfTransport{mode='" + mode + "', capacity=" + capacity + "}";
    }
}
