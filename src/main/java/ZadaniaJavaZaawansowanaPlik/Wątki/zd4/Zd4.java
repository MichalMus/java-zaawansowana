package ZadaniaJavaZaawansowanaPlik.Wątki.zd4;

public class Zd4 {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    account.pay(20000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                account.transfer(12000);
            }});

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                account.transfer(6000);
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
