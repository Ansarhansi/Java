package internal;

class SportsCar extends Vehicle1 {
    @Override
    public void move() {
        System.out.println("SportsCar is moving at high speed.");
    }
    public void accelerate() {
        System.out.println("SportsCar is accelerating.");
    }
}
