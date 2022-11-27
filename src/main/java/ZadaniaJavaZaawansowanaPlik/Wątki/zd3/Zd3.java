package ZadaniaJavaZaawansowanaPlik.Wątki.zd3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zd3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        int[] array1 = new int[10000];
        int[] array2 = new int[10000];
        for (int i = 0; i < 10000; i++){
            array1[i] = random.nextInt(20000);
            array2[i] = array1[i];
        }
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        String result = executorService.invokeAny(Arrays.asList(new BubbleSortStrategy(array1),
                new InsertionSortStrategy(array2)
        ));
        System.out.println(result);
        executorService.shutdown();
    }
}
