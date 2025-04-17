package internal;

class Novel extends Book {
    @Override
    public void describe() {
        System.out.println("This is a Novel.");
    }
    public void readStory() {
        System.out.println("Reading the novel's story.");
    }
}