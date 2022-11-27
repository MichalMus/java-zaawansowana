package zadania.zd26;

import java.util.List;

public class Model {
    public String name;
    public int productionStartYear;
    List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model: " + name + " "+ "productionStartYear: " + productionStartYear + " "+
                "cars: " + cars;
    }
}
