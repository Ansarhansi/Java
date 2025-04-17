package internal;

class Cake extends Dessert {
    @Override
    public void sweeten() {
        System.out.println("Cake is sweet and delicious.");
    }

    public void bake() {
        System.out.println("Baking the cake.");
    }
}