public class M13 {
    public void executeTask() { System.out.println("Executing task..."); }
    public void executeTask(int a) { System.out.println("Executing task with int: " + a); }
    public void executeTask(double a) { System.out.println("Executing task with double: " + a); }
    public void executeTask(String a) { System.out.println("Executing task with string: " + a); }
    public void executeTask(int a, int b) { System.out.println("Sum of two numbers: " + (a + b)); }
    public void executeTask(double a, double b) { System.out.println("Division result: " + (a / b)); }
    public void executeTask(int[] arr) { System.out.println("Sum of array: " + java.util.Arrays.stream(arr).sum()); }
    public void executeTask(double[] arr) { System.out.println("Max value: " + java.util.Arrays.stream(arr).max().getAsDouble()); }
    public void executeTask(String[] arr) { System.out.println("Joined strings: " + String.join(", ", arr)); }
    public void executeTask(int a, double b) { System.out.println("Sum of int and double: " + (a + b)); }
    public void executeTask(double a, int b) { System.out.println("Product of double and int: " + (a * b)); }
    public void executeTask(char c) { System.out.println("Character value: " + c); }
    public void executeTask(boolean flag) { System.out.println("Boolean flag: " + flag); }
    public void executeTask(byte b) { System.out.println("Byte value: " + b); }
    public void executeTask(short s) { System.out.println("Short value: " + s); }
    public void executeTask(long l) { System.out.println("Long value: " + l); }
    public void executeTask(float f) { System.out.println("Float value: " + f); }
    public void executeTask(int a, float f) { System.out.println("Mixed int-float: " + (a * f)); }
    public void executeTask(double d, float f) { System.out.println("Mixed double-float: " + (d + f)); }
    public void executeTask(String a, int b) { System.out.println("String and number: " + a + b); }
}
