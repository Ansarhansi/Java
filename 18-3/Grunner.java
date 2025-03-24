public class Grunner {
    public static void main(String[] args) {
        Item item = new Item();

        
        item.setDetails("Laptop", 50000);
        item.setDetails();

     
        item.setDetails("Frill and Thrill", "Dress", 3000);

       
        double[] prices = {1000.0, 2500.0, 5000.0, 7500.0};
        item.setDetails(prices); 
    }
}
