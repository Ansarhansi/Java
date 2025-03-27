public class Multi {
    static String[][] Bike = {{"Bugati", "Bullet", "Kawasaki"}, {"2019", "2020", "2021"}};

    public static void main(String[] args) {
        search(); // Call the search method
    }

    public static void search() {
        

        for (int i = 0; i < Bike.length - 1; i++) { 
            
            for (int j = 0; j < Bike[i].length; j++) {
                System.out.println(Bike[0][j] + " : " + Bike[1][j]); // Pairing first and second rows
            }
        }
    }
}
