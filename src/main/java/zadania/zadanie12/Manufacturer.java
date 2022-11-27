package zadania.zadanie12;

import java.util.Objects;

/**
 * Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
 */
public class Manufacturer {

    private String name;
    private Integer year;
    private String country;

    public Manufacturer(String name, Integer year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) return false;
        if (o instanceof Manufacturer m) {
            return this.name.equals(m.name) && this.year.equals(m.year) && this.country.equals(m.country);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, country);
    }
}
