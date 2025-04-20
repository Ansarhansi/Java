package Internal2;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard k1 = new Keyboard("Black", 1200, "Mechanical", 0.5);
        Keyboard k2 = new Keyboard("Black", 1200, "Membrane", 0.5);
        Keyboard k3 = new Keyboard("White", 1300, "Mechanical", 0.6);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println("Keyboard match: " + k1.equals(k2));
        System.out.println("Keyboard not match: " + k1.equals(k3));
    }
}
