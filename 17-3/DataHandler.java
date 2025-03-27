class DataHandler {
    void process(int a) { System.out.println("Processing Integer: " + a); }
    void process(double d) { System.out.println("Processing Double: " + d); }
    void process(String s) { System.out.println("Processing String: " + s); }
    void process(int a, int b) { System.out.println("Processing Two Integers: " + a + ", " + b); }
    void process(double a, double b) { System.out.println("Processing Two Doubles: " + a + ", " + b); }
    void process(int[] arr) { System.out.println("Processing Integer Array: " + java.util.Arrays.toString(arr)); }
    void process(double[] arr) { System.out.println("Processing Double Array: " + java.util.Arrays.toString(arr)); }
    void process(String[] arr) { System.out.println("Processing String Array: " + java.util.Arrays.toString(arr)); }
    void process(String s1, String s2) { System.out.println("Processing Two Strings: " + s1 + " and " + s2); }
    void process(char c) { System.out.println("Processing Character: " + c); }
}

