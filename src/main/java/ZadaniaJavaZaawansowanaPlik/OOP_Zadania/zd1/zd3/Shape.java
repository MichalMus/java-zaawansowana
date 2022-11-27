package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd3;

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape(){
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape (String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
       isFilled = filled;
    }
    public String toString(){
        return String.format("Shape with color of %s and %s", color,isFilled ? "filled": "Notfilled");
    }
}
