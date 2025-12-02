package intro.practice01;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

public class Main {

    public static void printShapeArea(Shape shape) {
        System.out.println("actual area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.print("rectangle area (5x10): ");
        printShapeArea(rectangle);

        System.out.print("square area (5x5): ");
        printShapeArea(square);
    }
}
