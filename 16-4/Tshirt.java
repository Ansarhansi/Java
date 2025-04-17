package internal;

class Tshirt extends Clothing {
    @Override
    public void describe() {
        System.out.println("This is a T-Shirt.");
    }
    public void wear() {
        System.out.println("Wearing a T-Shirt.");
    }
}
