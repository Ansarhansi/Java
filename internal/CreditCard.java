package internal;

class CreditCard extends PaymentMethod {
    @Override
    public void describe() {
        System.out.println("This is a Credit Card payment method.");
    }
    public void swipe() {
        System.out.println("Credit card swiped.");
    }
}