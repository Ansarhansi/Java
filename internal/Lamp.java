package internal;

public class Lamp {
    private String type;
    private int watts;

    public void setType(String type) { this.type = type; }
    public void setWatts(int watts) { this.watts = watts; }

    public void lightUp() {
        System.out.println("Lighting up a " + type + " lamp of " + watts + "W");
    }

    public String toString() {
        return "Lamp{type='" + type + "', watts=" + watts + "}";
    }
}
package internal;

class Lamp {
public void glow() {
    System.out.println("Lamp is glowing.");
}
}package internal;

public class Lamp {
    private String type;
    private int watts;

    public void setType(String type) { this.type = type; }
    public void setWatts(int watts) { this.watts = watts; }

    public void lightUp() {
        System.out.println("Lighting up a " + type + " lamp of " + watts + "W");
    }

    public String toString() {
        return "Lamp{type='" + type + "', watts=" + watts + "}";
    }
}
