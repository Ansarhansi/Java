package internal;

public class TransportSystem {
    private String type;
    private int vehicles;

    public TransportSystem(String type, int vehicles) {
        this.type = type;
        this.vehicles = vehicles;
    }

    public void transport() {
        System.out.println(type + " transport system is handling " + vehicles + " vehicles.");
    }

    public String toString() {
        return "TransportSystem{type='" + type + "', vehicles=" + vehicles + "}";
    }
}