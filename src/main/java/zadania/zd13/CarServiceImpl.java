package zadania.zd13;//package zadania.zd13;
//
//import zadania.zadanie12.Car;
//import zadania.zadanie12.EngineType;
//import zadania.zadanie12.Manufacturer;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class CarServiceImpl implements CarService {
//
//    private List<Car> cars;
//
//    public CarServiceImpl() {
//        this.cars = new ArrayList<>();
//    }
//
//    @Override
//    public void addCar(Car car) {
//        cars.add(car);
//
//    }
//
//    @Override
//    public void removeCar(Car car) {
//        cars.remove(car);
//    }
//
//    @Override
//    public List<Car> getAllCars() {
//        return cars;
//    }
//
//    @Override
//    public List<Car> getCarsByEngineType(EngineType engineType) {
//        return cars.stream().filter(car -> car.getEngineType().equals(engineType))
//                .collect(Collectors.toList());
//
//    }
//
//    @Override
//    public List<Car> getProducedBefore(Integer year) {
//        return cars.stream().filter(car -> car.getProdDate() < year)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Car getMostExpensiveCar() {
//        Car exp = cars.get(0);
//        for (Car c : cars) {
//            if (exp.getPrice() < c.getPrice()) {
//                exp = c;
//            }
//
//        }
//        return exp;
//    }
//
//    @Override
//    public Car getCheapestCar() {
//        Car cheap = cars.get(0);
//        for (Car c : cars) {
//            if (cheap.getPrice() > c.getPrice()) {
//                cheap = c;
//            }
//
//        }
//        return cheap;
//    }
//
//    @Override
//    public List<Car> findCarsWithMoreThenThreeManufactures() {
//        return cars.stream().filter(car -> car.getManufacturers().size() > 3)
//                .collect(Collectors.toList());
//    }
//
//
//    @Override
//    public List<Car> sortBy(String parametr) {
//        List<Car> carscopy = cars;
//        switch (parametr) {
//            case "rosnąco":
//                carscopy.sort(Comparator.comparing(Car::getPrice));
//                return carscopy;
//            case "malejąco":
//                carscopy.sort(Comparator.comparing(Car::getPrice).reversed());
//                return carscopy;
//            default:
//                throw new IllegalStateException();
//        }
//    }
//
//    @Override
//    public Boolean isOnList(Car car) {
//        return cars.contains(car);
//    }
//
//    @Override
//    public List<Car> findCarsByManufactures(Manufacturer manufacturer) {
//        return cars.stream().filter(car -> car.getManufacturers().contains(manufacturer))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    @Override
//    public List<Car> findCarsByManufacturerAndByYear(Manufacturer manufacturer, String comparing, Integer year) {
//        return cars.stream().filter(car -> car.getManufacturers()
//                .contains(manufacturer) && checkManufacturer(car.getManufacturers(), comparing, year)).toList();
//    }
//    private boolean checkManufacturer(List<Manufacturer> manufacturers, String comparing, Integer year){
//        List<Manufacturer> list = null;
//        switch (comparing){
//            case "<":
//                list = manufacturers.stream().filter(m->m.getYear()<year).toList();
//                break;
//            case ">":
//                list = manufacturers.stream().filter(m->m.getYear()>year).toList();
//                break;
//            case "<=":
//                list = manufacturers.stream().filter(m->m.getYear()<=year).toList();
//                break;
//            case ">=":
//                list = manufacturers.stream().filter(m->m.getYear()>=year).toList();
//                break;
//            case "=":
//                list = manufacturers.stream().filter(m->m.getYear().equals(year)).toList();
//                break;
//            case "!=":
//                list = manufacturers.stream().filter(m->!Objects.equals(m.getYear(),year)).toList();
//                break;
//            default:
//                throw new IllegalStateException();
//
//        }
//        return !list.isEmpty();
//
//    }
//}
