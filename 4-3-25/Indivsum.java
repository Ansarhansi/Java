public class Indivsum {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 6}, {1, 3, 7}};
        
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            System.out.println("The sum of row : " + rowSum);
        }
    }
}
