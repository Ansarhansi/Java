class Calculator {
    void compute() { System.out.println("No parameters"); }
    void compute(int a) { System.out.println("Integer: " + a); }
    void compute(double d) { System.out.println("Double: " + d); }
    void compute(String s) { System.out.println("String: " + s); }
    void compute(int a, int b) { System.out.println("Two Integers: " + a + ", " + b); }
    void compute(double a, double b) { System.out.println("Two Doubles: " + a + ", " + b); }
    void compute(int[] arr) { System.out.println("Integer Array: " + java.util.Arrays.toString(arr)); }
    void compute(double[] arr) { System.out.println("Double Array: " + java.util.Arrays.toString(arr)); }
    void compute(String[] arr) { System.out.println("String Array: " + java.util.Arrays.toString(arr)); }
    void compute(int a, double b) { System.out.println("Int and Double: " + a + ", " + b); }
}

