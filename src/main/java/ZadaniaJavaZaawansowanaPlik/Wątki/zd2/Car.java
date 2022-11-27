package ZadaniaJavaZaawansowanaPlik.Wątki.zd2;

public class Car {
    private String nameOfCar;
    private String typeOfCar;

    public Car(String nameOfCar, String typeOfCar) {
        this.nameOfCar = nameOfCar;
        this.typeOfCar = typeOfCar;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + nameOfCar + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
