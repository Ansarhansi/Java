package Internal2;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion c1 = new Cushion("Blue", 800, "Cotton", "Medium");
        Cushion c2 = new Cushion("Blue", 800, "Polyester", "Large");
        Cushion c3 = new Cushion("Red", 1000, "Velvet", "Medium");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Cushion match: " + c1.equals(c2));
        System.out.println("Cushion not match: " + c1.equals(c3));
    }
}
