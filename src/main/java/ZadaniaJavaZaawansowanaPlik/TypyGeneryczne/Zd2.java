package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne;

import ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd4.Validator;

import java.util.List;

public class Zd2 {
    public static void main(String[] args) {
        Integer[] tab = new Integer[]{10,35,46,57};
        int counter = Zd2.countIf(tab, new Validator<Integer>() {
            @Override
            public boolean validate(Integer value) {
                return value % 5 == 0;
            }
        });
        System.out.println(counter);



    }
    interface Validator<T>{
        boolean validate (T value);
    }

    public static <T> int countIf (T[] tab, Validator<T> validator){
        int count = 0;
        for (T element : tab){
            if (validator.validate(element)){
                count++;
            }
        }
        return count;
    }

}
