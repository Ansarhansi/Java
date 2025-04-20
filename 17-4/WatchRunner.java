package Internal2;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w1 = new Watch("Black", 2000, "Titan", 1.5);
        Watch w2 = new Watch("Black", 2000, "Fastrack", 1.5);
        Watch w3 = new Watch("Silver", 2500, "Casio", 2.0);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        System.out.println("Watch match: " + w1.equals(w2));
        System.out.println("Watch not match: " + w1.equals(w3));
    }
}

