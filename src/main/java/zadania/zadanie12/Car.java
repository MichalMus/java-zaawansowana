package zadania.zadanie12;

import java.util.List;
import java.util.Objects;

/**
 * Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
 * oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
 */
public class Car {

    private String name;
    private String model;
    private Double price;
    private Integer prodDate;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, Double price, Integer prodDate, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.prodDate = prodDate;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProdDate() {
        return prodDate;
    }

    public void setProdDate(Integer prodDate) {
        this.prodDate = prodDate;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(prodDate, car.prodDate) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, prodDate, manufacturers, engineType);
    }
}
