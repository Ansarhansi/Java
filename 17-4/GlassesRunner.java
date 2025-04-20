package Internal2;

public class GlassesRunner {
    public static void main(String[] args) {
        Glasses g1 = new Glasses("Black", 5000, "Sunglasses", "Metal");
        Glasses g2 = new Glasses("Black", 5000, "Sunglasses", "Plastic");
        Glasses g3 = new Glasses("Blue", 5500, "Eyeglasses", "Titanium");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        System.out.println("Glasses match: " + g1.equals(g2));
        System.out.println("Glasses not match: " + g1.equals(g3));
    }
}
