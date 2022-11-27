package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd3;

public class Square extends Rectangle {
    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("kwadrat z długhością boku %f i szerokością %f jest podklasą %s", width, length, super.toString());
    }
}