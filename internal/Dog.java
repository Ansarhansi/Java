package internal;

class Dog extends Animal {
    @Override
    public void describe() {
        System.out.println("This is a Dog, a loyal animal.");
    }
    public void bark() {
        System.out.println("Dog is barking.");
    }
}