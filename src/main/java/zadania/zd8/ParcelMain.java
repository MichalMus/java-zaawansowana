package zadania.zd8;

public class ParcelMain {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(130, 100, 130, 10.0f, true);
        ValidatorImp val = new ValidatorImp();
        val.validate(parcel);

    }
}