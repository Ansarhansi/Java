 public class TemperatureConverter {
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double fromKelvin(double kelvin, String scale) {
        if (scale.equalsIgnoreCase("Celsius")) {
            return kelvin - 273.15;
        } else if (scale.equalsIgnoreCase("Fahrenheit")) {
            return toFahrenheit(kelvin - 273.15);
        }
        return kelvin;
    }
}
