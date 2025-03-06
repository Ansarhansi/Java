public class Counter {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 8,4};
        int specificValue = 4;
        int count = 0;
        
        for (int element : array) {
        if (element > specificValue) {
         count++;
            }
        }
        
        System.out.println("Number of elements greater than : " + count);
    }
}
