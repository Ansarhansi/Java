public class Pattern1 {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2, 6}, 
            {1,2, 3},
            {1,2,3}
        };

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) { 
                System.out.print(arr[i][j]+""); 
            }
            System.out.println(); 
        }
    }
}
