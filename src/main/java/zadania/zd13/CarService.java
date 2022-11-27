package zadania.zd13;

import zadania.zadanie12.Car;
import zadania.zadanie12.EngineType;
import zadania.zadanie12.Manufacturer;

import java.util.List;

public interface CarService {

    void addCar(Car car);
    void removeCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsByEngineType(EngineType engineType);
    List<Car> getProducedBefore(Integer year);
    Car getMostExpensiveCar();
    Car getCheapestCar();
    List<Car> findCarsWithMoreThenThreeManufactures();
    List<Car> sortBy(String parametr);
    Boolean isOnList(Car car);
    List<Car> findCarsByManufactures(Manufacturer manufacturer);
    List<Car> findCarsByManufacturesAndByYear (Manufacturer manufacturer, String comparing, Integer year);
}
