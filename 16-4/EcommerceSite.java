package internal;

class EcommerceSite extends Website {
    @Override
    public void describe() {
        System.out.println("This is an E-commerce Website.");
    }
    public void listProducts() {
        System.out.println("Listing products on E-commerce site.");
    }
}
