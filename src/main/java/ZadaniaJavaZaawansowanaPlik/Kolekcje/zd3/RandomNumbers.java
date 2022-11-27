package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd3;

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

///////nie zrobione
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int rands = random.nextInt(25);
            numbers.add(rands);
        }
        Collections.sort(numbers);

        System.out.println(numbers);
        System.out.println();
        unicatNumbers(numbers);


    }

    public static Set<Integer> unicatNumbers(List<Integer> cos) {
        Set<Integer> unikNumbers = new TreeSet<>();
        Set<Integer> duplicateNumbers = new TreeSet<>();

        for (Integer i : cos) {
            if (i == i++) {
                duplicateNumbers.add(i);
            } else {
                unikNumbers.add(i);
        }

    }
//        System.out.print(unikNumbers);
        System.out.print(duplicateNumbers);
        return unikNumbers;

    }
}

