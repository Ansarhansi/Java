public class M11 {
    public void process() { System.out.println("Processing..."); }
    public void process(int a) { System.out.println("Processing int: " + a); }
    public void process(double a) { System.out.println("Processing double: " + a); }
    public void process(String a) { System.out.println("Processing string: " + a); }
    public void process(int a, int b) { System.out.println("Difference: " + (a - b)); }
    public void process(double a, double b) { System.out.println("Division: " + (a / b)); }
    public void process(int[] arr) { System.out.println("Array Sum: " + java.util.Arrays.stream(arr).sum()); }
    public void process(double[] arr) { System.out.println("Max Value: " + java.util.Arrays.stream(arr).max().getAsDouble()); }
    public void process(String[] arr) { System.out.println("Joined String: " + String.join(", ", arr)); }
    public void process(int a, double b) { System.out.println("Mix Int & Double: " + (a + b)); }
    public void process(String a, int b) { System.out.println("String with number: " + a + b); }
    public void process(char c) { System.out.println("Character processed: " + c); }
    public void process(boolean flag) { System.out.println("Boolean process: " + flag); }
    public void process(byte b) { System.out.println("Byte process: " + b); }
    public void process(short s) { System.out.println("Short process: " + s); }
    public void process(long l) { System.out.println("Long process: " + l); }
    public void process(float f) { System.out.println("Float process: " + f); }
    public void process(int a, float f) { System.out.println("Mixed int-float: " + (a * f)); }
    public void process(double d, float f) { System.out.println("Mixed double-float: " + (d + f)); }
    public void process(String a, String b) { System.out.println("Merged Strings: " + a + " " + b); }
}
