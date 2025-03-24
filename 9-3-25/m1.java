// M1 Class with 20 overloaded methods
public class M1 {
    void display() { System.out.println("No parameters"); }
    void display(int a) { System.out.println("Integer: " + a); }
    void display(double d) { System.out.println("Double: " + d); }
    void display(String s) { System.out.println("String: " + s); }
    void display(int a, int b) { System.out.println("Two Integers: " + a + ", " + b); }
    void display(double a, double b) { System.out.println("Two Doubles: " + a + ", " + b); }
    void display(int[] arr) { System.out.println("Integer Array: " + java.util.Arrays.toString(arr)); }
    void display(double[] arr) { System.out.println("Double Array: " + java.util.Arrays.toString(arr)); }
    void display(String[] arr) { System.out.println("String Array: " + java.util.Arrays.toString(arr)); }
    void display(int a, double b) { System.out.println("Int and Double: " + a + ", " + b); }
    void display(double a, int b) { System.out.println("Double and Int: " + a + ", " + b); }
    void display(char c) { System.out.println("Character: " + c); }
    void display(boolean flag) { System.out.println("Boolean: " + flag); }
    void display(byte b) { System.out.println("Byte: " + b); }
    void display(short s) { System.out.println("Short: " + s); }
    void display(long l) { System.out.println("Long: " + l); }
    void display(float f) { System.out.println("Float: " + f); }
    void display(int a, float f) { System.out.println("Int and Float: " + a + ", " + f); }
    void display(double a, float f) { System.out.println("Double and Float: " + a + ", " + f); }
    void display(String s, int a) { System.out.println("String and Integer: " + s + ", " + a); }
}

