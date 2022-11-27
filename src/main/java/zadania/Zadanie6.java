package zadania;

import java.util.Map;
import java.util.TreeMap;

/*
Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
 */
public class Zadanie6 {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Ania");
        tm.put(2,"Gosia");
        tm.put(3,"Asia");
        tm.put(4,"Michał");
        showElementOfMap(tm);

    }
    public static void showElementOfMap(TreeMap<Integer,String> ntm){
        System.out.println("numer: "+ntm.firstEntry().getKey()+" " + "wartość: " + ntm.firstEntry().getValue());
        System.out.println("numer: "+ntm.lastEntry().getKey()+ " "+ "wartość: "+ntm.lastEntry().getValue());
    }



}
