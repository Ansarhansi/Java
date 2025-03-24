public class M10 {
    public void execute() { System.out.println("Executing..."); }
    public void execute(int a) { System.out.println("Executing int: " + a); }
    public void execute(double a) { System.out.println("Executing double: " + a); }
    public void execute(String a) { System.out.println("Executing string: " + a); }
    public void execute(int a, int b) { System.out.println("Sum: " + (a + b)); }
    public void execute(double a, double b) { System.out.println("Product: " + (a * b)); }
    public void execute(int[] arr) { System.out.println("Array Length: " + arr.length); }
    public void execute(double[] arr) { System.out.println("First Element: " + arr[0]); }
    public void execute(String[] arr) { System.out.println("Last Element: " + arr[arr.length - 1]); }
    public void execute(int a, double b) { System.out.println("Int-Double mix: " + (a * b)); }
    public void execute(String a, int b) { System.out.println("Repeated String: " + a.repeat(b)); }
    public void execute(char c) { System.out.println("Character received: " + c); }
    public void execute(boolean flag) { System.out.println("Boolean flag: " + flag); }
    public void execute(byte b) { System.out.println("Byte value: " + b); }
    public void execute(short s) { System.out.println("Short value: " + s); }
    public void execute(long l) { System.out.println("Long value: " + l); }
    public void execute(float f) { System.out.println("Float value: " + f); }
    public void execute(int a, float f) { System.out.println("Int-Float mix: " + (a / f)); }
    public void execute(double d, float f) { System.out.println("Double-Float mix: " + (d - f)); }
    public void execute(String a, String b) { System.out.println("Concatenation: " + a + b); }
}
