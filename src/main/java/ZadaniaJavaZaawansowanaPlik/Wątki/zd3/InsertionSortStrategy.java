package ZadaniaJavaZaawansowanaPlik.Wątki.zd3;

import java.util.concurrent.Callable;

public class InsertionSortStrategy implements Callable<String> {
    private int[] array;

    public InsertionSortStrategy(int[] array) {
        this.array = array;
    }

    public void insertionSort(){
        for (int i = 0; i < array.length -1; i++){
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]){
                // while (i-1 >= 0 && array[i] < array[i-1])
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

    }
    @Override
    public String call() throws Exception {
        insertionSort();
        return "Insertion sort";
    }
}
