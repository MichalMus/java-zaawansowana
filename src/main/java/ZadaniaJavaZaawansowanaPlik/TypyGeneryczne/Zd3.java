package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne;

import java.util.Arrays;

public class Zd3 {

    public static void main(String[] args) {
        String[] st = new String[]{"Michał", "ma", "Asię"};
       Exe.swap(st,0,2);
        System.out.println(Arrays.toString(st));


    }

    class Exe {
        public static <T> void swap(T[] tab, int index1, int index2) {
            T val = tab[index1];
            tab[index1] = tab[index2];
            tab[index2] = val;

        }
    }

}
