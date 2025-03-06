public class Pattern {
    public static void main(String[] args) {
        
        int[][] arr = {
            {2, 6}, 
            {1, 3},
            {4,5}
        };

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) { 
                System.out.print("%"); 
            }
            System.out.println(); 
        }
    }
}
