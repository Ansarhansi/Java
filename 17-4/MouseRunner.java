package Internal2;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Black", 500, "Logitech", 1200);
        Mouse m2 = new Mouse("Black", 500, "HP", 1000);
        Mouse m3 = new Mouse("White", 550, "Dell", 1200);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Mouse match: " + m1.equals(m2));
        System.out.println("Mouse not match: " + m1.equals(m3));
    }
}
