public class WeatherAnalyzer {
    public void displayWeather(double temperature, String condition) {
        System.out.println("Temperature: " + temperature + "°C, Condition: " + condition);
    }

    public void displayWeather(String city, double temperature, String condition) {
        System.out.println("City: " + city + ", Temperature: " + temperature + "°C, Condition: " + condition);
    }
}
