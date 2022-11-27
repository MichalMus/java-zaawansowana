package zadania;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zadanie2 {


    public static List<String> sortList(List<String> someList){
        Comparator<String> listString = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().compareTo(o1.toLowerCase()) ;
            }
        };
        someList.sort(listString);

        return someList;
    }
}
