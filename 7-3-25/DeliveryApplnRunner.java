public class DeliveryApplnRunner {
    public static void main(String[] args) {
        DeliveryAppln.listOfApplication("zomato");
        DeliveryAppln.listOfApplication("swiggy");
        DeliveryAppln.listOfApplication("Zomato");
        DeliveryAppln.listOfApplication("Blink it");
        DeliveryAppln.displayName();

        boolean found = DeliveryAppln.searchName("swiggy");
        System.out.println("Search result: " + found);
    }
}