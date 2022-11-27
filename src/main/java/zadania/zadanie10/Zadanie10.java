package zadania.zadanie10;

import zadania.zadanie9.Circle;
import zadania.zadanie9.Point2D;

/**
 * Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor.
 * Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
 * Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
 * Przy wywołaniu metody move(MoveDirection moveDirection),
 * obiekty mają zmienić swoje położenie na podstawie przekazanego kierunku (MoveDirection).
 * Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
 */
public class Zadanie10 {


    public static void main(String[] args) {
        var point = new Point2D(0,0);
        System.out.println("Punkt przed wykonaniem przesuniecia: " + point);
        var direction = new MoveDirection(1,1);
        point.move(direction);
        System.out.println("Punkt po wykonaniu przesuniecia: " + point);

        Point2D center = new Point2D(0,0);
        Point2D point1 = new Point2D(0,10);
        Circle circle = new Circle(center, point1);
        System.out.println("Okrąg przed wykonaniem przesuniecia: " + circle);
        circle.move(direction);
        System.out.println("Okrąg po wykonaniu przesuniecia: " + circle);
    }
}
