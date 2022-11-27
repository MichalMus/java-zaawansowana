package ZadaniaJavaZaawansowanaPlik.IO.zd6;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private String nameDirector;

    private String genre;
    private int yearOfProduction;

    public Movie(String title, String nameDirector, String genre, int yearOfProduction) {
        this.title = title;
        this.nameDirector = nameDirector;
        this.genre = genre;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", nameDirector='" + nameDirector + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
