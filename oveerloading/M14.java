public class M14 { 
    public void analyze() { System.out.println("Analysis Started"); }
    public void analyze(int a) { System.out.println("Integer: " + a); }
    public void analyze(double a) { System.out.println("Double: " + a); }
    public void analyze(String a) { System.out.println("String: " + a); }
    public void analyze(int a, int b) { System.out.println("Difference: " + (a - b)); }
    public void analyze(double a, double b) { System.out.println("Quotient: " + (a / b)); }
    public void analyze(int[] arr) { System.out.println("Sum of Array: " + java.util.Arrays.stream(arr).sum()); }
    public void analyze(double[] arr) { System.out.println("First Element: " + arr[0]); }
    public void analyze(String[] arr) { System.out.println("Last Word: " + arr[arr.length - 1]); }
    public void analyze(int a, double b) { System.out.println("Mixed Sum: " + (a + b)); }
    public void analyze(double a, int b) { System.out.println("Mixed Multiplication: " + (a * b)); }
    public void analyze(char a) { System.out.println("Character: " + a); }
    public void analyze(boolean a) { System.out.println("Boolean Value: " + a); }
    public void analyze(byte a) { System.out.println("Byte Value: " + a); }
    public void analyze(short a) { System.out.println("Short Value: " + a); }
    public void analyze(long a) { System.out.println("Long Value: " + a); }
    public void analyze(float a) { System.out.println("Float Value: " + a); }
    public void analyze(int a, float b) { System.out.println("Int & Float Sum: " + (a + b)); }
    public void analyze(double a, float b) { System.out.println("Double & Float Product: " + (a * b)); }
    public void analyze(String a, int b) { System.out.println("String with Number: " + a + " " + b); }
}
