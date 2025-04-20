package Internal2;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("Red", 750, "Syska", 3.2);
        Lamp lamp2 = new Lamp("Green", 750, "Syska", 3.2);
        Lamp lamp3 = new Lamp("Red", 750, "Syska", 3.2);

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);

        System.out.println("Lamp match: " + lamp1.equals(lamp3));
        System.out.println("Lamp not match: " + lamp1.equals(lamp2));
    }
}
