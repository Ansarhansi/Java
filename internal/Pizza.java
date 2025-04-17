package internal;

class Pizza extends Dish {
    @Override
    public void serve() {
        System.out.println("Serving hot pizza.");
    }

    public void addToppings() {
        System.out.println("Adding extra toppings to pizza.");
    }
}
