package Internal2;

public class TelescopeRunner {
    public static void main(String[] args) {
        Telescope t1 = new Telescope("Red", 5000, 50.5, "Nikon");
        Telescope t2 = new Telescope("Red", 5000, 55.0, "Canon");
        Telescope t3 = new Telescope("Blue", 5500, 50.5, "Nikon");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("Telescope match: " + t1.equals(t2));
        System.out.println("Telescope not match: " + t1.equals(t3));
    }
}
