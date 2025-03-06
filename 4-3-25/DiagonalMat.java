public class DiagonalMat{
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int s = matrix.length; 
        int sum = 0;

        
        for (int i = 0; i < s; i++) {
            sum += matrix[i][i]; 
            sum += matrix[i][s - 1 - i]; 
        }

        
        if (s % 2 == 1) {
            sum -= matrix[s / 2][s / 2];
        }

        System.out.println("Sum of diagonals: " + sum);
}
}