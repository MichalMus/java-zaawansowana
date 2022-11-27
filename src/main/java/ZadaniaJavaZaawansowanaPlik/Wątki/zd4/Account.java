package ZadaniaJavaZaawansowanaPlik.Wątki.zd4;

public class Account {
    float saldo;

    public Account(float saldo) {
        this.saldo = saldo;
    }



    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + saldo +
                '}';
    }

    public synchronized void transfer(float kwota) {
        saldo += kwota;
        notify();
        System.out.print("Wplacono kwotę: " + kwota + " saldo: " + saldo);


    }

    public synchronized void pay(float amout) throws InterruptedException {
        while (saldo < amout) {
            System.out.println("not enough money. Please waiting");
            wait();
        }
        saldo -= amout;
        System.out.printf("Zapłacono: " + amout + " saldo wynosi: " + saldo);
    }
}
