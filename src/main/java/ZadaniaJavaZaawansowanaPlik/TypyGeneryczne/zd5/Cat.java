package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne.zd5;

public class Cat extends Animal{

    protected int numberOfLife;

    public Cat(String name, int numberOfLife) {
        super(name);
        this.numberOfLife = numberOfLife;
    }

    public int getNumberOfLife() {
        return numberOfLife;
    }

    public void setNumberOfLife(int numberOfLife) {
        this.numberOfLife = numberOfLife;
    }

    @Override
    public String toString() {
        return "Cat: " + "name: " + name + " " +
                "number of Lifes: " + numberOfLife;
    }
}
