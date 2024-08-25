package Geometry;

public class Main {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5.0, "blue", "black");
        GeometricShape rectangle = new Rectangle(4.0, 6.0, "green", "red");
        GeometricShape triangle = new Triangle(3.0, 4.0, 5.0, "yellow", "purple");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill color: " + circle.getFillColor());
        System.out.println("Line color: " + circle.getLineColor());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill color: " + rectangle.getFillColor());
        System.out.println("Line color: " + rectangle.getLineColor());
        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill color: " + triangle.getFillColor());
        System.out.println("Line color: " + triangle.getLineColor());
        System.out.println();
    }
}
