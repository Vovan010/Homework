package Geometry;

public class Triangle implements GeometricShape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String lineColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String lineColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
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
