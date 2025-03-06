public class RowSum {
    public static void main(String[] args) {
        
        int[][] a = {
            {2, 4, 6}, 
            {1, 3, 7}, 
            {5, 9, 8}
        };

        int targetRow = 0; 
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (i == targetRow) { 
                for (int j = 0; j < a[i].length; j++) {
                    sum += a[i][j]; 
                }
               
            }
        }

        System.out.println("The sum of row " + targetRow + " is: " + sum);
    }
}
