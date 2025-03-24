public class FoodNameRunner {
    public static void main(String[] args) {
        FoodName.saveFood("Pizza");
        FoodName.saveFood("Burger");
        FoodName.saveFood("Pizza");  
        FoodName.saveFood("Pasta");
        FoodName.saveFood("Fries");
        FoodName.saveFood("Sushi");  

        FoodName.displayFoodNames();

        boolean found = FoodName.searchFood("Burger");
        System.out.println("Search result: " + found);
    }
}