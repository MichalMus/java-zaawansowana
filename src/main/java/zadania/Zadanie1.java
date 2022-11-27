package zadania;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów,
 * następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
 */
public class Zadanie1 {
    private List<String> list = new ArrayList<>();

    public static List<String> sortList(List<String> someList){
        Collections.sort(someList);

    return someList;
    }
}
