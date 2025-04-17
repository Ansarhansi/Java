package internal;

class Dollar extends Currency {
    @Override
    public void describe() {
        System.out.println("This is the US Dollar.");
    }
    public void exchange() {
        System.out.println("Exchanging Dollars.");
    }
}