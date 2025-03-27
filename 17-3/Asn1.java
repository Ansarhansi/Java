public class Asn1 {
    public void evaluate() { System.out.println("Evaluation Started"); }
    public void evaluate(int a) { System.out.println("Integer: " + a); }
    public void evaluate(double a) { System.out.println("Double: " + a); }
    public void evaluate(String a) { System.out.println("String: " + a); }
    public void evaluate(int a, int b) { System.out.println("Difference: " + (a - b)); }
    public void evaluate(double a, double b) { System.out.println("Division: " + (a / b)); }
    public void evaluate(int[] arr) { System.out.println("Sum of Array: " + java.util.Arrays.stream(arr).sum()); }
    public void evaluate(double[] arr) { System.out.println("First Element: " + arr[0]); }
    public void evaluate(String[] arr) { System.out.println("First String: " + arr[0]); }
}