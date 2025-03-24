 public class M15 {
    
    void determine() { System.out.println("M15: Determination Started"); }
    void determine(int a) { System.out.println("M15: Integer Value: " + a); }
    void determine(double a) { System.out.println("M15: Double Value: " + a); }
    void determine(String a) { System.out.println("M15: String Value: " + a); }
    void determine(int a, int b) { System.out.println("M15: Difference: " + (a - b)); }
    void determine(double a, double b) { System.out.println("M15: Division Result: " + (a / b)); }
    void determine(int[] arr) { System.out.println("M15: Sum of Array Elements: " + java.util.Arrays.stream(arr).sum()); }
    void determine(String[] arr) { System.out.println("M15: First String Element: " + arr[0]); }
    void determine(char a) { System.out.println("M15: Character Value: " + a); }
    void determine(boolean a) { System.out.println("M15: Boolean Value: " + a); }
    void determine(byte a) { System.out.println("M15: Byte Value: " + a); }
    void determine(short a) { System.out.println("M15: Short Value: " + a); }
    void determine(long a) { System.out.println("M15: Long Value: " + a); }
    void determine(float a) { System.out.println("M15: Float Value: " + a); }
    void determine(int a, float b) { System.out.println("M15: Int & Float: " + (a - b)); }
    void determine(double a, float b) { System.out.println("M15: Double & Float: " + (a / b)); }
    void determine(String a, int b) { System.out.println("M15: String & Int: " + a + " " + b); }
    void determine(int a, double b) { System.out.println("M15: Mix: " + (a - b)); }
    void determine(double a, int b) { System.out.println("M15: Mix: " + (a / b)); }
    void determine(int a, String b) { System.out.println("M15: Int & String: " + a + " - " + b); }
}
