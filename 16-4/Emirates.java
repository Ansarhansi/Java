package internal;

class Emirates extends Airline {
    @Override
    public void fly() {
        System.out.println("Emirates flight taking off.");
    }

    public void serveMeal() {
        System.out.println("Serving gourmet meal.");
    }
}