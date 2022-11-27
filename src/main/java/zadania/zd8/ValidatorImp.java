package zadania.zd8;

public class ValidatorImp implements Validator{
    @Override
    public boolean validate(Parcel input) {
        if (input.isExpress() == true && input.getWeight() <= 15.0 && (input.getxLength()
                + input.getyLength() + input.getzLength() > 300) &&
                (input.getxLength() >= 30 && input.getyLength() >= 30 && input.getzLength() >= 30)){
            return true;
        }else if (input.isExpress() == false && input.getWeight() <= 30.0 && (input.getxLength()
                + input.getyLength() + input.getzLength() > 300) &&
                (input.getxLength() >= 30 && input.getyLength() >= 30 && input.getzLength() >= 30)){
            return true;
        }
        System.out.println("Paczka przekracza wymagane normy");
        return false;
    };

}
