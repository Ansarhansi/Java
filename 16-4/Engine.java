package internal;

public class Engine {
    private String model;
    private int power;

    public void setModel(String model) { this.model = model; }
    public void setPower(int power) { this.power = power; }

    public void start() {
        System.out.println(model + " engine with " + power + "HP started.");
    }

    public String toString() {
        return "Engine{model='" + model + "', power=" + power + "}";
    }
}
