package internal;

public class Bridge {
    private String location;
    private double length;

    public void setLocation(String location) { this.location = location; }
    public void setLength(double length) { this.length = length; }

    public void cross() {
        System.out.println("Crossing bridge in " + location + " of length " + length + " meters");
    }

    public String toString() {
        return "Bridge{location='" + location + "', length=" + length + "}";
    }
}
