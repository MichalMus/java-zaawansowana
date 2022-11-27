package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd6;

public class MovableCircle implements Movable{

    private MovablePoint mp;
    private double radius;

    public MovableCircle(double radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.mp = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override

    public void moveUp() {
       mp.moveUp();
    }

    @Override
    public void moveDown() {
        mp.moveDown();

    }

    @Override
    public void moveLeft() {
        mp.moveLeft();

    }

    @Override
    public void moveRigth() {
        mp.moveRigth();

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "mp=" + mp +
                ", radius=" + radius +
                '}';
    }
}
