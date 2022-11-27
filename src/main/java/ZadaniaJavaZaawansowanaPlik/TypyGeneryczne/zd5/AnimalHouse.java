package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne.zd5;

public class AnimalHouse <T extends Animal> {
    T[] myAnimals;

    public AnimalHouse(T[] animal){
        this.myAnimals = animal;
    }
    public T[] getMyAnimals(){
        return myAnimals;
    }

    public void setMyAnimals(T[] animals){
        this.myAnimals = animals;
    }


}
