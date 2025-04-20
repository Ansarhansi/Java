package Internal2;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow p1 = new Pillow("White", 600, "Cotton", 8.5);
        Pillow p2 = new Pillow("White", 600, "Feather", 8.0);
        Pillow p3 = new Pillow("Grey", 700, "Memory Foam", 9.0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Pillow match: " + p1.equals(p2));
        System.out.println("Pillow not match: " + p1.equals(p3));
    }
}
