package internal;

class Sunscreen extends PersonalCareItem {
    @Override
    public void apply() {
        System.out.println("Sunscreen is being applied to protect from sun.");
    }
    public void checkSPF() {
        System.out.println("Sunscreen SPF is being checked.");
    }
}