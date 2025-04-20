package Internal2;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan1 = new Fan("White", 2500, "Usha", 400);
        Fan fan2 = new Fan("White", 2500, "Orient", 400);
        Fan fan3 = new Fan("White", 2500, "Usha", 400);

        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);

        System.out.println("Fan match: " + fan1.equals(fan3));
        System.out.println("Fan not match: " + fan1.equals(fan2));
    }
}
