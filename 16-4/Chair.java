package internal;

class Chair extends Furniture {
    @Override
    public void describe() {
        System.out.println("This is a Chair for sitting.");
    }
    public void adjustHeight() {
        System.out.println("Chair height is adjusted.");
    }
}