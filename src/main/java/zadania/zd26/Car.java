package zadania.zd26;

public class Car {
    public String name;
    public String description;
    public CarType car;

    public Car(String name, String description, CarType car) {
        this.name = name;
        this.description = description;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car: " + name + " " + "opis: " + description + " " + car;
    }
}
