abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("This is a geometric shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle Area: %.2f%n", area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.printf("Rectangle Area: %.2f%n", area);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape myShape;

        myShape = new Circle(5.0);
        System.out.println("Circle: ");
        myShape.display();
        myShape.calculateArea();

        System.out.println();

        myShape = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle: ");
        myShape.display();
        myShape.calculateArea();
    }
}