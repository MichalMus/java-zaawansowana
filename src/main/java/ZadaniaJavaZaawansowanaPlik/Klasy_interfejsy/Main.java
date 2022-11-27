package ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy;

import ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd1.UserValidator;
import ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd2.Movie;
import ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd2.kindOffilm;

public class Main {
    public static void main(String[] args) {
        UserValidator uv = new UserValidator();
        String[] results = uv.validateEmail("pb@", "adamancjusz@gmail.pl");
        System.out.println(results[0]);
        System.out.println(results[1]);

      Movie m1 = new Movie.MovieCreator()
              .setTitle("Władca")
              .setNameDirector("Tomassz")
              .setYearOfProduction(1999)
              .setKf(kindOffilm.FANTASY)
              .setWydawca("Jano")
              .createMovie();
        System.out.println(m1);
    }
}
