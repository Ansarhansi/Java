package internal;

public class EngineType {
    private String fuelType;
    private int horsepower;

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public void setHorsepower(int horsepower) { this.horsepower = horsepower; }

    public void start() {
        System.out.println("Starting " + fuelType + " engine.");
    }

    public String toString() {
        return "EngineType{fuelType='" + fuelType + "', horsepower=" + horsepower + "}";
    }
}
