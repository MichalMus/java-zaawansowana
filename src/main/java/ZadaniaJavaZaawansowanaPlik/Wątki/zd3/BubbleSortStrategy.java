package ZadaniaJavaZaawansowanaPlik.Wątki.zd3;

import java.util.concurrent.Callable;

public class BubbleSortStrategy implements Callable<String> {
    private int[] array;

    public BubbleSortStrategy(int[] array) {
        this.array = array;
    }

    public void bubbleSort(){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String call() throws Exception {
        bubbleSort();
        return "Bubble sort";
    }
}
