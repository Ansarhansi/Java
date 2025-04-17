package internal;

public class Metal {
    private String name;
    private double density;

    public Metal(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public void melt() {
        System.out.println(name + " is melting");
    }

    public String toString() {
        return "Metal{name='" + name + "', density=" + density + " g/cm^3}";
    }
}
