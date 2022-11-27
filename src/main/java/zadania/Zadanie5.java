package zadania;//package zadania;
//
//import java.lang.annotation.Target;
//import java.util.*;
//
///*
//Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet.
//W tym celu zaimplementuj obsługę metod:
//• add
//• remove
//• size
//• contains
//• clear
// */
//public class Zadanie5 <T> {
//   public Map<Integer, T> map = new HashMap<>();
//
//    public void add(T value) {
//        if (!map.containsKey(value.hashCode())){
//            map.put(value.hashCode(), value)
//        } else {
//            list.add(value);
//        }
//    }
//
//    public void remove(String value) {
//        if (list.contains(value)) {
//            list.remove(value);
//        } else {
//            System.out.println("Podany element nie istnieje w liście");
//        }
//    }
//
//    public int size() {
//        System.out.println(list.size());
//        return list.size();
//
//
//    }
//
//    public boolean contains(String value) {
//        if (list.contains(value)) {
//            return true;
//
//        }
//        return false;
//    }
//
//    public void clear() {
//        if (!(list.isEmpty())) {
//            list.clear();
//        }
//    }
//
//    public static void main(String[] args) {
//        Zadanie5 zd = new Zadanie5();
//        zd.add("Michał");
//        zd.add("Jan");
//        zd.add("Asia");
//
//       zd.size();
//       zd.remove("Michał");
//        System.out.println(zd.contains("Michał"));
//    }
//
//}
