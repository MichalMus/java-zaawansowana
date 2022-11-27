package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd1;

public class Point2D{
    //pola
    protected float x;
   protected float y;

    //konstruktory
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //gettery
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Point2D: " + "("+
                "x= " + x +
                ", y=" + y +
                ")";
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    //settery
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }


}
