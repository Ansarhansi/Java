class Printer {
    void print() { System.out.println("Printing with no parameters"); }
    void print(int a) { System.out.println("Printing Integer: " + a); }
    void print(double d) { System.out.println("Printing Double: " + d); }
    void print(String s) { System.out.println("Printing String: " + s); }
    void print(int a, int b) { System.out.println("Printing Two Integers: " + a + ", " + b); }
    void print(double a, double b) { System.out.println("Printing Two Doubles: " + a + ", " + b); }
    void print(int[] arr) { System.out.println("Printing Integer Array: " + java.util.Arrays.toString(arr)); }
    void print(double[] arr) { System.out.println("Printing Double Array: " + java.util.Arrays.toString(arr)); }
    void print(String[] arr) { System.out.println("Printing String Array: " + java.util.Arrays.toString(arr)); }
    void print(char c) { System.out.println("Printing Character: " + c); }
}

