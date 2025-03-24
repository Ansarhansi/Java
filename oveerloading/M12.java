public class M12 {
    public void operate() { System.out.println("Operating..."); }
    public void operate(int a) { System.out.println("Operating on int: " + a); }
    public void operate(double a) { System.out.println("Operating on double: " + a); }
    public void operate(String a) { System.out.println("Operating on string: " + a); }
    public void operate(int a, int b) { System.out.println("Sum: " + (a + b)); }
    public void operate(double a, double b) { System.out.println("Multiplication: " + (a * b)); }
    public void operate(int[] arr) { System.out.println("Array Sum: " + java.util.Arrays.stream(arr).sum()); }
    public void operate(double[] arr) { System.out.println("Max Value: " + java.util.Arrays.stream(arr).max().getAsDouble()); }
    public void operate(String[] arr) { System.out.println("Concatenated Strings: " + String.join(", ", arr)); }
    public void operate(int a, double b) { System.out.println("Mixed Int & Double: " + (a + b)); }
    public void operate(double a, int b) { System.out.println("Double & Int Multiplication: " + (a * b)); }
    public void operate(char c) { System.out.println("Character: " + c); }
    public void operate(boolean flag) { System.out.println("Boolean value: " + flag); }
    public void operate(byte b) { System.out.println("Byte value: " + b); }
    public void operate(short s) { System.out.println("Short value: " + s); }
    public void operate(long l) { System.out.println("Long value: " + l); }
    public void operate(float f) { System.out.println("Float value: " + f); }
    public void operate(int a, float f) { System.out.println("Mixed int-float: " + (a * f)); }
    public void operate(double d, float f) { System.out.println("Mixed double-float: " + (d + f)); }
    public void operate(String a, int b) { System.out.println("String with number: " + a + b); }
}
