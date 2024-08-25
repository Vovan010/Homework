package Geometry;

public class Circle implements GeometricShape {
    private double radius;
    private String fillColor;
    private String lineColor;

    public Circle(double radius, String fillColor, String lineColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getLineColor() {
        return lineColor;
    }
}
