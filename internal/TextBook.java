package internal;

class TextBook extends Book {
    @Override
    public void describe() {
        System.out.println("This is a TextBook used for studying.");
    }
    public void read() {
        System.out.println("Reading a TextBook.");
    }
}