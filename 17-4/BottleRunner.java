package Internal2;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Red", 100, "Plastic", 1.5);
        Bottle bottle2 = new Bottle("Red", 100, "Steel", 1.5);
        Bottle bottle3 = new Bottle("Blue", 150, "Plastic", 2.0);

        System.out.println(bottle1);
        System.out.println(bottle2);
        System.out.println(bottle3);

        System.out.println("Bottle match: " + bottle1.equals(bottle2));
        System.out.println("Bottle not match: " + bottle1.equals(bottle3));
    }
}
