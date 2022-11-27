package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (double) (width * length);
    }

    public double getPerimeter() {
        return (double) ((2 * width) + (2 * length));
    }

    @Override
    public String toString() {
        return String.format
                ("Rectangle with width %f and length %f which is a subclass off %s ", width, length, super.toString());
    }
}
