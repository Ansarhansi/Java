 public class Geometry {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of circle
    }

    public double calculateArea(double length, double width) {
        return length * width; // Area of rectangle
    }

    public double calculateArea(int side) {
        return side * side; // Area of square
    }

    public double calculateVolume(double length, double width, double height) {
        return length * width * height; // Volume of cuboid
    }
}
