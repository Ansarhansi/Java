package Internal2;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Black", 800, "Brand1", 10);
        Chair chair2 = new Chair("Black", 800, "Brand2", 11);
        Chair chair3 = new Chair("Black", 800, "Brand1", 10);

        System.out.println(chair1);
        System.out.println(chair2);
        System.out.println(chair3);

        System.out.println("Chair match: " + chair1.equals(chair3));
        System.out.println("Chair not match: " + chair1.equals(chair2));
    }
}
