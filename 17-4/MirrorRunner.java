package Internal2;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror m1 = new Mirror("Silver", 800, "Round", 2.0);
        Mirror m2 = new Mirror("Silver", 800, "Oval", 2.0);
        Mirror m3 = new Mirror("Black", 850, "Square", 2.5);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Mirror match: " + m1.equals(m2));
        System.out.println("Mirror not match: " + m1.equals(m3));
    }
}
