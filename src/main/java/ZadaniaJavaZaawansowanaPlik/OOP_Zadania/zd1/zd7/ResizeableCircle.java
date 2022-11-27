package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd7;

public class ResizeableCircle extends Circle implements Resizable{

    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent/100;
            }

    @Override
    public String toString() {
        return "ResizeableCircle{" +
                "radius=" + radius +
                '}';
    }
}
