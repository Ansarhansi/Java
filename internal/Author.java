package internal;

class Author extends Writer {
    @Override
    public void write() {
        System.out.println("Author is writing a novel.");
    }

    public void publish() {
        System.out.println("Publishing the book.");
    }
}