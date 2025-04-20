package Internal2;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Red", 500, "Nike", 1.5);
        Bag bag2 = new Bag("Blue", 600, "Nike", 1.5);
        Bag bag3 = new Bag("Red", 500, "Nike", 1.5);

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);

        System.out.println("Bag match: " + bag1.equals(bag3));
        System.out.println("Bag not match: " + bag1.equals(bag2));
    }
}
