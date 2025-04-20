package Internal2;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet h1 = new Helmet("Red", 2000, "Vega", 1.2);
        Helmet h2 = new Helmet("Red", 2000, "Studds", 1.1);
        Helmet h3 = new Helmet("Black", 1800, "Steelbird", 1.3);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("Helmet match: " + h1.equals(h2));
        System.out.println("Helmet not match: " + h1.equals(h3));
    }
}
