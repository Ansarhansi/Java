package internal;

class Painting extends Art {
    @Override
    public void display() {
        System.out.println("Displaying a beautiful painting.");
    }

    public void frame() {
        System.out.println("Framing the painting.");
    }
}