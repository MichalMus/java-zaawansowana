package zadania.zd23;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ZOO {

    private Map<String,Integer> animals;
    public ZOO(){
        this.animals = new HashMap<>();
    }
    public int getNumberOfAnimals(){
        Integer result = 0;
        for(Integer i : animals.values()){
            result += i;
        }
         return result;
     }

     Map<String, Integer> getAnimalsCount(){
        return animals;

     }
    Map<String, Integer> getAnimalsCountSorted(){
        animals.entrySet().stream().sorted(Collections
                .reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return null;
    }

    void addAnimals(String animal, int numberOfAnimals){
        animals.put(animal,numberOfAnimals);
    }
}
