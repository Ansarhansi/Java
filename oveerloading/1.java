// Runner Class
public class Runner {
    public static void main(String[] args) {
        M1[] objects = {
            new M1(), new M2(), new M3(), new M4(), new M5(),
            new M6(), new M7(), new M8(), new M9(), new M10(),
            new M11(), new M12(), new M13(), new M14(), new M15(),
            new M16(), new M17(), new M18(), new M19(), new M20()
        };

        for (M1 obj : objects) {
            System.out.println("\nCalling methods for class: " + obj.getClass().getSimpleName());
            obj.display();
            obj.display(10);
            obj.display(5.5);
            obj.display("Hello");
            obj.display(2, 3);
            obj.display(2.5, 3.5);
            obj.display(new int[]{1, 2, 3});
            obj.display(new double[]{1.1, 2.2, 3.3});
            obj.display(new String[]{"A", "B", "C"});
            obj.display(10, 5.5);
            obj.display(5.5, 10);
            obj.display('A');
            obj.display(true);
            obj.display((byte) 127);
            obj.display((short) 32000);
            obj.display(9999999999L);
            obj.display(3.14f);
            obj.display(10, 3.14f);
            obj.display(2.71, 2.5f);
            obj.display("Java", 101);
        }
    }
}
