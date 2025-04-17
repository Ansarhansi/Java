package internal;

public class GameConsole {
    private String brand;
    private boolean isPortable;

    public GameConsole(String brand, boolean isPortable) {
        this.brand = brand;
        this.isPortable = isPortable;
    }

    public void playGame() {
        System.out.println("Playing on " + brand);
    }

    public String toString() {
        return "GameConsole{brand='" + brand + "', isPortable=" + isPortable + "}";
    }
}
