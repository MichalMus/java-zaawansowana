package zadania;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
 *
 * Zaimplementuj metody:
 * loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
 * isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
 * shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i
 * przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
 */
public class Zadanie7ver2 {
    private int capacity;

    private List<String> bullets;

    public Zadanie7ver2(int capacity){
        this.capacity = capacity;
        this.bullets = new ArrayList<>(capacity);
    }
    public void loadBullets(String bullet){
        if(bullet.length()<capacity){
            bullets.add(bullet);
        }

    }
    public boolean isLoaded(){
        return !bullets.isEmpty();
    }
    public void shot(){
        if(bullets.isEmpty()){
            System.out.println("Nie ma kul");
        }else{
            bullets.remove(bullets.size()-1);
            System.out.println("wystrzelono");
        }
    }
}
