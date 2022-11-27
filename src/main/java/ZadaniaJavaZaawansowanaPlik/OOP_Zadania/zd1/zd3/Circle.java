package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd3;

public class Circle extends Shape {
    private float radius;

    public Circle(){
        super();
        this.radius = 1f;
    }
    public Circle(String color, boolean filled, float rd){
        super(color,filled);
        this.radius = rd;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea(){
        return (float) (Math.PI*radius*radius);
    }
    public float getPerimeter(){
        return (float) (2*Math.PI*radius);
    }
    public String toString(){
        return String.format("Circle with radius= %f which is a subclass off %s ", radius,super.toString());
    }
}
