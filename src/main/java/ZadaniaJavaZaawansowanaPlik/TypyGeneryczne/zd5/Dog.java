package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne.zd5;

public class Dog extends Animal{

    protected String favouriteFood;

    public Dog(String name, String food) {
        super(name);
        this.favouriteFood = food;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String toString() {
        return "Dog: " + "name: " + name + " " +
                "favouriteFood: " + favouriteFood;
    }
}
