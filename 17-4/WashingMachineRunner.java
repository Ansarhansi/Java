package Internal2;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("White", 20000, "Whirlpool", 7);
        WashingMachine w2 = new WashingMachine("White", 20000, "Samsung", 6);
        WashingMachine w3 = new WashingMachine("Silver", 22000, "LG", 7);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        System.out.println("Washing Machine match: " + w1.equals(w2));
        System.out.println("Washing Machine not match: " + w1.equals(w3));
    }
}
