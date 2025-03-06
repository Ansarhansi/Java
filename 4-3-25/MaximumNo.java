public class MaximumNo {
    public static void main(String[] args) {
        
        int[][] a = {
            {3, 4, 5},
            {2, 1, 8},
            {7, 6, 5},
            {9, 1, 2}
        };

        int target=a[0][0];

        
        for (int i = 0; i < a.length; i++) {
            target=a[i][0];
            
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>target){
                target=a[i][j];

                }

                
            }
             System.out.println("the row with maximum value is:"+target);
        }
        
    }

            
           
        }

        
       
