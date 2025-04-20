package Internal2;

public class WindowRunner {
    public static void main(String[] args) {
        Window win1 = new Window("Brown", 2500, "Wood", 4.5);
        Window win2 = new Window("Brown", 2500, "Aluminum", 4.5);
        Window win3 = new Window("White", 2800, "UPVC", 5.0);

        System.out.println(win1);
        System.out.println(win2);
        System.out.println(win3);

        System.out.println("Window match: " + win1.equals(win2));
        System.out.println("Window not match: " + win1.equals(win3));
    }
}
