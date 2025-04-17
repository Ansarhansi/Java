package internal;

class Pizza1 extends FoodItem {
    @Override
    public void prepare() {
        System.out.println("Pizza is being baked in the oven.");
    }
    public void addCheese() {
        System.out.println("Pizza is having cheese added.");
    }
}