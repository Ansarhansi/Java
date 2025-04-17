package internal;

class Circle extends Shape {
    @Override
    public void describe() {
        System.out.println("This is a Circle with a radius.");
    }
    public void calculateArea() {
        System.out.println("Calculating area of Circle.");
    }
}
