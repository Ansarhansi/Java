package Internal2;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("White", 1000, "Nike", 9);
        Shoe shoe2 = new Shoe("White", 1000, "Adidas", 9);
        Shoe shoe3 = new Shoe("White", 1000, "Nike", 9);

        System.out.println(shoe1);
        System.out.println(shoe2);
        System.out.println(shoe3);

        System.out.println("Shoe match: " + shoe1.equals(shoe3));
        System.out.println("Shoe not match: " + shoe1.equals(shoe2));
    }
}
