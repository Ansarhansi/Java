class Triangle extends Polygon {
    @Override
    void calculateArea() {
        System.out.println("Calculating area of the triangle.");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Calculating perimeter of the triangle.");
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle.");
    }

    @Override
    void sidesInfo() {
        System.out.println("A triangle has 3 sides.");
    }

    @Override
    void isRegular() {
        System.out.println("Determining if the triangle is regular.");
    }
}