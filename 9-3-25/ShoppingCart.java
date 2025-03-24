public class ShoppingCart {
    public void addItem(String item) {
        System.out.println(item + " added to cart.");
    }

    public void addItem(String item, int quantity) {
        System.out.println(quantity + " of " + item + " added to cart.");
    }
}
