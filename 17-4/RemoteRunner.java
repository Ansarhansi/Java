package Internal2;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote r1 = new Remote("Black", 150, "Sony", 10.0);
        Remote r2 = new Remote("Black", 150, "LG", 15.0);
        Remote r3 = new Remote("White", 200, "Samsung", 20.0);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("Remote match: " + r1.equals(r2));
        System.out.println("Remote not match: " + r1.equals(r3));
    }
}
