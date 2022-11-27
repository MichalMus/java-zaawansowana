package ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd1;

public class Zadanie1 {
    public static double divide(double firstNumber, double secondNumber) throws CannotDivideByZeroException {
        if (secondNumber == 0) {
            throw new CannotDivideByZeroException();
        }
        return (double) (firstNumber / secondNumber);


    }
}
