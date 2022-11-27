package zadania.zd26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*



 */

public class zd26Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi","auto rodzinne",CarType.SEDAN);
        Car car2 = new Car("BMW","auto sportowe",CarType.CABRIO);
        Car car3 = new Car("Audi","auto rodzinne",CarType.HATCHBACK);
        Car car4 = new Car("Audi","auto rodzinne",CarType.COUPE);
        Car car5 = new Car("BMW","auto rodzinne",CarType.SEDAN);

        Model model1 = new Model("A6", 2022, Arrays.asList(car1,car4,car3));
        Model model2 = new Model("X3", 2020,Arrays.asList(car2,car5));

        Manufacturer manufacturer1 = new Manufacturer("super Fabryka", 1995, Arrays.asList(model1,model2));
        Manufacturer manufacturer2 = new Manufacturer("jeszcze lepsza Fabryka", 2000, Arrays.asList(model1,model2));
        List<Manufacturer> manufacturers = Arrays.asList(manufacturer1,manufacturer2);

        //listę wszystkich Modelów,
        List<Model> models = manufacturers.stream()
                .flatMap(m->m.models.stream())
                .collect(Collectors.toList());

        //listę wszystkich aut
        List<Car> cars = manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .flatMap(a -> a.cars.stream())
                .collect(Collectors.toList());

         // listę wszystkich nazw producentów
        List<String> nameOfManufacturers = manufacturers.stream()
                .map(m ->m.name)
                .toList();

        //listę wszystkich lat założenia producentów,
        List<Integer> listOfYearsManufakturers = manufacturers.stream()
                .map(m ->m.yearOfCreation)
                .collect(Collectors.toList());

        // listę wszystkich nazw modeli,
        List<String> listOfModelsNames = manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .map(s -> s.name)
                .collect(Collectors.toList());

        // * listę wszystkich lat startu produkcji modeli
        List<Integer> listOfYearsStartProductionsModels = manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .map(s -> s.productionStartYear)
                .collect(Collectors.toList());

         //listę wszystkich nazw aut
        List<String> listOfNamesCars = manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .flatMap(n -> n.cars.stream())
                .map(c -> c.name)
                .collect(Collectors.toList());

        //* listę wszystkich opisów aut
        List<String> listOfCarsDescription = manufacturers.stream()
                .flatMap(m->m.models.stream())
                .flatMap(n->n.cars.stream())
                .map(c->c.description)
                .collect(Collectors.toList());

        // * tylko modele z parzystym rokiem startu produkcji
        List<Model> listOfModels2 = manufacturers.stream()
                .flatMap(m->m.models.stream())
                .filter(n->n.productionStartYear / 2 == 0)
                .toList();

        // * tylko auta producentów z parzystym rokiem założenia,
        List<Car> ListOfCarsManufacturerwith2year = manufacturers.stream()
                .filter(m -> m.yearOfCreation / 2 == 0)
                .flatMap(n -> n.models.stream())
                .flatMap(o -> o.cars.stream()).toList();


        //tylko auta z parzystym rokiem startu produkcji modelu
        // oraz nieparzystym rokiem założenia producenta,

        List<Car> strangeList = manufacturers.stream()
                .filter(m->m.yearOfCreation / 2 != 0)
                .flatMap(n ->n.models.stream())
                .filter(n->n.productionStartYear / 2 == 0)
                .flatMap( o -> o.cars.stream())
                .collect(Collectors.toList());

        //* tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu
        // i parzystym rokiem założenia producenta,
        List<Car> strangeList2 = manufacturers.stream()
                .filter(m->m.yearOfCreation / 2 == 0)
                .flatMap(n ->n.models.stream())
                .filter(n->n.productionStartYear / 2 != 0)
                .flatMap( o -> o.cars.stream())
                .filter(c -> c.car.equals(CarType.CABRIO))
                .collect(Collectors.toList());

        //* tylko auta typu SEDAN z modelu nowszego niż 2019
        // oraz rokiem założenia producenta mniejszym niż 1919.

        List<Car> strangelist3 = manufacturers.stream()
                .filter(m->m.yearOfCreation < 1919)
                .flatMap(n ->n.models.stream())
                .filter(n->n.productionStartYear > 2019)
                .flatMap( o -> o.cars.stream())
                .filter(c -> c.car.equals(CarType.SEDAN))
                .collect(Collectors.toList());

        System.out.println(listOfCarsDescription);

    }
}
