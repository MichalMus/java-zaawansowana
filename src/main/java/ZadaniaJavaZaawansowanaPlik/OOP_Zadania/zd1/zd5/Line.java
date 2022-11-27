package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd5;

import ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd1.Point2D;

public class Line {
    //pola
    private Point2D startPoint;
    private Point2D endPoint;

        //konstruktory
    public Line(Point2D sP, Point2D eP) {
        this.startPoint = sP;
        this.endPoint = eP;
    }
    public Line(float a, float b, float c, float d){
        this.startPoint = new Point2D(a,b);
        this.endPoint = new Point2D(c,d);
    }

    //gettery i settery

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
    ///metody

    public double length(){
        return Math.sqrt(((startPoint.getX()-endPoint.getX())*(startPoint.getX()-endPoint.getX()))+
                ((startPoint.getY() - endPoint.getY())*(startPoint.getY() - endPoint.getY())));
    }
    public Point2D centralPoint(){
        return new Point2D (((startPoint.getX()+endPoint.getX())/2),((startPoint.getY()+endPoint.getY())/2));
    }
}
