package Internal2;

public class TVRunner {
    public static void main(String[] args) {
        TV tv1 = new TV("Black", 40000, "Samsung", 43.0);
        TV tv2 = new TV("Black", 40000, "LG", 43.0);
        TV tv3 = new TV("Grey", 45000, "Sony", 55.0);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println("TV match: " + tv1.equals(tv2));
        System.out.println("TV not match: " + tv1.equals(tv3));
    }
}
