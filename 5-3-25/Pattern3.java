public class Pattern3 {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2, 6}, 
            {1,2, 3},
            {1,2,3}
        };

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= i; j--) { 
                System.out.print(j+""); 
            }
            System.out.println(); 
        }
    }
}
