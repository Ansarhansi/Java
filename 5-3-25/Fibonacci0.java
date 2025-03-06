public class Fibonacci0{

    
    public static void fib(){
        int n = 9;
        int first =0, second =1;

        System.out.print("Fibonacci Series up to " + n + ": " + first + ", " + second);

        for (int i=2; i <= n; i++) {
            int next = first + second;
            System.out.print(","+ next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        fib();
}
}