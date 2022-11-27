package ZadaniaJavaZaawansowanaPlik.Wątki.zd2;

public class Bridge {
    Car car;
    public synchronized void driveThrough(Car car){
        System.out.println("Griving throught: " + car);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Finished: " + car);
    }

}
