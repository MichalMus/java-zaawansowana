package zadania.zadanie12;

/**
 * Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
 *
 * Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
 * oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
 */
public class Zadanie12 {

    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("", 1900, "sfswdfsf");
        Manufacturer manufacturer2 = new Manufacturer("", 1900, "");
        System.out.println(manufacturer2.equals(manufacturer1));
    }
}
