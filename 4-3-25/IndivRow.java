public class IndivRow {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 6}, {1, 3, 7},{5,9,8}};
        
        for (int i = 0; i < a.length; i++) {
            if(i==2){
             int Sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                Sum += a[i][j];
            }
        
            System.out.println("The sum of row : " + Sum);
        }
    }
}
}

