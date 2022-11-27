package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd7;

public class Circle implements GeometricObject{

   protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI*radius);
    }

    @Override
    public double getArea() {
        return (double) (Math.PI*(radius*radius));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
