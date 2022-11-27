package zadania;
/*
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość
definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:

loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować
więcej naboi niż wynosi pojemność magazynka

isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie

shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden -
ostatni załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim,
jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
 */

import java.util.Arrays;

public class Zadanie7 {
    public int sizeMagazine;
    public static int number = 0;
    String[] numberOfBullet = new String[sizeMagazine];

    public Zadanie7(int sizeMagazine) {
        this.sizeMagazine = sizeMagazine;
        this.numberOfBullet = new String[sizeMagazine];

    }

    public void loadBullet(String bullet) {
        if (number < sizeMagazine) {
            for (int i = 0; i < numberOfBullet.length; i++) {
                if (numberOfBullet[i] == null) {
                    numberOfBullet[i] = bullet;
                    break;
                }
            }
            number++;
        } else {
            System.out.println("pełny magazynek");
        }
    }

    public void isLoaded() {
        for (int i = 0; i < numberOfBullet.length; i++) {
            if (numberOfBullet[i] != null) {
                System.out.println("naładowany");
                break;
            }
            System.out.println("nienaładowany");
        }

    }


    public void shot() {
        if(sizeMagazine>0){
            System.out.println("Strzał");
            sizeMagazine--;
        }else   {
            System.out.println("Pusto");
        }
    }


    public static void main(String[] args) {
        Zadanie7 bullet = new Zadanie7(4);
        bullet.loadBullet("a");
        bullet.loadBullet("b");
        bullet.loadBullet("c");
        bullet.loadBullet("d");
        bullet.loadBullet("e");

//        bullet.isLoaded();
        bullet.shot();
        bullet.shot();
        bullet.shot();
        bullet.shot();
        bullet.shot();
        bullet.shot();
        bullet.shot();

    }

}
