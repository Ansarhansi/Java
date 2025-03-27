public class MRunner {
    static String[][] Bike = {
        {"Bugati", "Bullet", "Kawasaki"}, 
      
    };
    static int[][] Address = {
        {101, 102, 103}, 
        
    }; 

    public static void main(String[] args) {
        search(); // Call the search method
    }

    public static void search() {
       

       
        for (int i = 0; i < Bike.length; i++) {
         
            for (int j = 0; j < Bike[i].length; j++) {
               
                System.out.println(Bike[i][j] + ":" + Address[i][j] );
            }
        }
    }
}
