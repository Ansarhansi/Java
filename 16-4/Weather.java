package internal;

public class Weather {
    private String condition;
    private double temperature;

    public Weather(String condition, double temperature) {
        this.condition = condition;
        this.temperature = temperature;
    }

    public void display() {
        System.out.println("Weather: " + condition + " at " + temperature + "°C");
    }

    public String toString() {
        return "Weather{condition='" + condition + "', temperature=" + temperature + "}";
    }
}
