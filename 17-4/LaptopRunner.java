package Internal2;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Grey", 50000, "Dell", 15.6);
        Laptop laptop2 = new Laptop("Grey", 50000, "HP", 14.0);
        Laptop laptop3 = new Laptop("Black", 55000, "Lenovo", 15.6);

        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

        System.out.println("Laptop match: " + laptop1.equals(laptop2));
        System.out.println("Laptop not match: " + laptop1.equals(laptop3));
    }
}
