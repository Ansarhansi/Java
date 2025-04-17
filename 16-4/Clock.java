package internal;

public class Clock {
    private String type;
    private String timezone;

    public void setType(String type) { this.type = type; }
    public void setTimezone(String timezone) { this.timezone = timezone; }

    public void showTime() {
        System.out.println("Showing " + type + " clock in " + timezone + " timezone");
    }

    public String toString() {
        return "Clock{type='" + type + "', timezone='" + timezone + "'}";
    }
}
