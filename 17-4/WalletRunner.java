package Internal2;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet w1 = new Wallet("Brown", 500, "Leather", 8.5);
        Wallet w2 = new Wallet("Brown", 500, "Faux", 8.0);
        Wallet w3 = new Wallet("Black", 600, "Leather", 9.0);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        System.out.println("Wallet match: " + w1.equals(w2));
        System.out.println("Wallet not match: " + w1.equals(w3));
    }
}
