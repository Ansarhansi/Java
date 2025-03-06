public class LowerTriSum {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {5, 0, 0},
            {3, 4, 0},
            {1, 2, 7}
        };

        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0; 
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) { 
                    System.out.print(matrix[i][j] + " ");
                    rowSum += matrix[i][j];
                } else {
                    System.out.print("0 "); 
                }
            }
            System.out.println(); 

            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }
    }
}
