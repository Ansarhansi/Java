package Internal2;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge f1 = new Fridge("Silver", 25000, "Samsung", 350);
        Fridge f2 = new Fridge("Silver", 25000, "LG", 300);
        Fridge f3 = new Fridge("White", 27000, "Whirlpool", 350);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println("Fridge match: " + f1.equals(f2));
        System.out.println("Fridge not match: " + f1.equals(f3));
    }
}


