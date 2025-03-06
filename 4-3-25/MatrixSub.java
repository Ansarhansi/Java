public class MatrixSub {

    public static void main(String[] args) {
        
        int matrix1[][] = {
            {5, 3, 2},
            {1, 7, 4},
            {6, 8, 9}
        };
        int matrix2[][] = {
            {2, 1, 3},
            {4, 3, 5},
            {1, 6, 2}
        };

        
        int rows = matrix1.length;
        int columns = matrix1.length;

        int resultMatrix[][] = new int[rows][columns];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                   System.out.print(resultMatrix[i][j] + " ");

            }
            System.out.println();
        }

     }
        // System.out.println("Result :");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         // System.out.print(resultMatrix[i][j] + " ");
        //     }
        //     System.out.println();
        
    
}
            