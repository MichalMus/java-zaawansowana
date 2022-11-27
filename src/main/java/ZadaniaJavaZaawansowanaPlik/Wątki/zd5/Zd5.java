package ZadaniaJavaZaawansowanaPlik.Wątki.zd5;

public class Zd5 {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new Iterator<>(new Integer[]{1,4,50,434,78});
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    int value = iterator.next();
                    System.out.println(Thread.currentThread().getName()+" " + value);

                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    int value = iterator.prev();
                    System.out.println(Thread.currentThread().getName()+ " "+ value);
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                         e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }
}
