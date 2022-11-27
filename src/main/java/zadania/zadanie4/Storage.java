package zadania.zadanie4;//package zadania.zadanie4;
//
//
//import java.util.*;
//
///**
// * Stwórz klasę Storage, która będzie miała prywatne pole typu Map,
// * publiczny konstruktor oraz metody:
// * addToStorage(String key, String value) → dodawanie elementów do przechowywalni
// * printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
// * findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
// * <p>
// * Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
// */
//
//public class Storage {
//    //pole
//    public Map<String, List<String>> newMap = new HashMap<>();
//
//    //konstruktor
//    public Storage(Map<String, List<String>) {
//        this.newMap = newMap;
//    }
//
//    //metody
//    public void addToStorage(String key, String value) {
//        if (newMap.containsKey(key)){
//            newMap.get(key).add(value);
//        }
//        else (newMap.put(key,new ArrayList<>(Collections.singletonList(value)));
//        newMap.put(key, value);
//    }
//
//    public void printValues(String key) {
//        newMap.forEach((k, v) -> {
//            if (k.equals(key))
//                System.out.println(v);
//        });
//
//
//        }
//    public void findValues (String value){
//        newMap.forEach((k,v) -> {
//            if(v.contains(value)) {
//                System.out.println(k);
//            }});
//
//    }
//}
