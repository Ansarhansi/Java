public class MaxColSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSum = 0;
        int maxColumn = a[0][0];

        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = col;
            }
        }

        System.out.println("Column with maximum sum is: " + maxColumn + " with sum: " + maxSum);
    }
}
