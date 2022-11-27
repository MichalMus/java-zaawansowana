package ZadaniaJavaZaawansowanaPlik.Wątki.zd2;

public class Zd2 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "E90");
        Car car2 = new Car("Audi", "A4");

        Bridge bridge = new Bridge();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });

        th1.start();
        th2.start();


    }
}
