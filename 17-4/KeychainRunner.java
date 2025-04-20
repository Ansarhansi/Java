package Internal2;

public class KeychainRunner {
    public static void main(String[] args) {
        Keychain k1 = new Keychain("Silver", 100, "Metal", 5.0);
        Keychain k2 = new Keychain("Silver", 100, "Plastic", 4.5);
        Keychain k3 = new Keychain("Gold", 120, "Metal", 5.0);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println("Keychain match: " + k1.equals(k2));
        System.out.println("Keychain not match: " + k1.equals(k3));
    }
}
