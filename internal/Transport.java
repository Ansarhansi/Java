package internal;

public class Transport {
    private String mode;
    private int speed;

    public void setMode(String mode) { this.mode = mode; }
    public void setSpeed(int speed) { this.speed = speed; }

    public void travel() {
        System.out.println("Traveling by " + mode);
    }

    public String toString() {
        return "Transport{mode='" + mode + "', speed=" + speed + " km/h}";
    }
}
