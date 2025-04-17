package internal;

class Coffee extends Beverage {
    @Override
    public void describe() {
        System.out.println("This is Coffee, a hot drink.");
    }
    public void stir() {
        System.out.println("Stirring the coffee.");
    }
}