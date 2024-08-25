package Geometry;

public class Rectangle implements GeometricShape {
    private double width;
    private double height;
    private String fillColor;
    private String lineColor;

    public Rectangle(double width, double height, String fillColor, String lineColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
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
