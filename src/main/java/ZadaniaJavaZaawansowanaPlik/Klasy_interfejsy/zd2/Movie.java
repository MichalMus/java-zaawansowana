package ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd2;

public class Movie {
    private String title;
    private String nameDirector;
    private int yearOfProduction;
    private kindOffilm kf;
    private String wydawca;
    public Movie(){};

    public Movie(String title, String nameDirector, int yearOfProduction, kindOffilm kf, String wydawca) {
        this.title = title;
        this.nameDirector = nameDirector;
        this.yearOfProduction = yearOfProduction;
        this.kf = kf;
        this.wydawca = wydawca;
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

    public kindOffilm getKf() {
        return kf;
    }

    public void setKf(kindOffilm kf) {
        this.kf = kf;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", nameDirector='" + nameDirector + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", kf=" + kf +
                ", wydawca='" + wydawca + '\'' +
                '}';
    }

public static class MovieCreator{
    private String title;
    private String nameDirector;
    private int yearOfProduction;
    private kindOffilm kf;
    private String wydawca;

    public MovieCreator setTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieCreator setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    return this;
    }

    public MovieCreator setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    return this;
    }

    public MovieCreator setKf(kindOffilm kf) {
        this.kf = kf;
    return this;
    }

    public MovieCreator setWydawca(String wydawca) {
        this.wydawca = wydawca;
        return this;
    }
    public Movie createMovie() {
        Movie movie = new Movie(title, nameDirector, yearOfProduction, kf , wydawca);
        return movie;
    }
}
}

