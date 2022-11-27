package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd2;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;
    private String sex;

    public Author(String name, String lastName, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name)
                && Objects.equals(lastName, author.lastName)
                && Objects.equals(sex, author.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, sex);
    }
}
