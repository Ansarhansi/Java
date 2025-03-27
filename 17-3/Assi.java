public class Assi {
    void show() { System.out.println("No parameters"); }
    void show(int a) { System.out.println("Integer: " + a); }
    void show(double d) { System.out.println("Double: " + d); }
    void show(String s) { System.out.println("String: " + s); }
    void show(int a, int b) { System.out.println("Two Integers: " + a + ", " + b); }
    void show(double a, double b) { System.out.println("Two Doubles: " + a + ", " + b); }
    void show(int[] arr) { System.out.println("Integer Array: " + java.util.Arrays.toString(arr)); }
    void show(double[] arr) { System.out.println("Double Array: " + java.util.Arrays.toString(arr)); }
    void show(String[] arr) { System.out.println("String Array: " + java.util.Arrays.toString(arr)); }
    void show(int a, double b) { System.out.println("Int and Double: " + a + ", " + b); }
    
}