package Internal2;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Blue", 10, "Parker", 5.5);
        Pen pen2 = new Pen("Black", 15, "Reynolds", 5.0);
        Pen pen3 = new Pen("Black", 15, "Cello", 6.0);

//        // Display the objects
//        System.out.println(pen1);
//        System.out.println(pen2);
//        System.out.println(pen3);

        // Compare for match and non-match
        boolean match = pen2.equals(pen3);
        boolean notMatch = pen1.equals(pen2);

        System.out.println("Pen match: " + match);
        System.out.println("Pen not match: " + notMatch);
    }
}
