package internal;

class LabradorDog extends PetAnimal {
    @Override
    public void interact() {
        System.out.println("Labrador dog is playing fetch.");
    }
    public void bark() {
        System.out.println("Labrador dog is barking.");
    }
}