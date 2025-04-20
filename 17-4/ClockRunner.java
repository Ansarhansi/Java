package Internal2;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock1 = new Clock("Silver", 1500, "Brand", 12.5);
        Clock clock2 = new Clock("Gold", 1500, "Brand", 12.5);
        Clock clock3 = new Clock("Silver", 1500, "Brand", 12.5);

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

        System.out.println("Clock match: " + clock1.equals(clock3));
        System.out.println("Clock not match: " + clock1.equals(clock2));
    }
}
