package internal;

class English extends Language {
    @Override
    public void describe() {
        System.out.println("This is the English language.");
    }
    public void speak() {
        System.out.println("Speaking in English.");
    }
}