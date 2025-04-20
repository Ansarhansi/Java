class Square extends Polygon {
    @Override
    void calculateArea() {
        System.out.println("Calculating area of the square.");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Calculating perimeter of the square.");
    }

    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    void sidesInfo() {
        System.out.println("A square has 4 sides.");
    }

    @Override
    void isRegular() {
        System.out.println("A square is always regular.");
    }
}