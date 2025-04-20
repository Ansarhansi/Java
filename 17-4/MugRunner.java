package Internal2;

public class MugRunner {
    public static void main(String[] args) {
        Mug m1 = new Mug("White", 250, "Coffee", 350);
        Mug m2 = new Mug("White", 250, "Tea", 300);
        Mug m3 = new Mug("Black", 300, "Coffee", 350);

//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);

        System.out.println("Mug match: " + m1.equals(m2));
        System.out.println("Mug not match: " + m1.equals(m3));
    }
}
