package internal;

public class Rocket {
    private String name;
    private double speed;

    public void setName(String name) { this.name = name; }
    public void setSpeed(double speed) { this.speed = speed; }

    public void launch() {
        System.out.println(name + " launched at speed " + speed + " km/h");
    }

    public String toString() {
        return "Rocket{name='" + name + "', speed=" + speed + "}";
    }
}
