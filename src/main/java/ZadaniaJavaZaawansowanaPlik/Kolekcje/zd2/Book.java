package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd2;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private float price;
    private int yearOfPublication;
    private GenreOfBook kind;
    private List<Author> author;


    public Book(String title, float price, int yearOfPublication, GenreOfBook kind, List<Author> author) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.kind = kind;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public GenreOfBook getKind() {
        return kind;
    }

    public void setKind(GenreOfBook kind) {
        this.kind = kind;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Float.compare(book.getPrice(), getPrice()) == 0 && getYearOfPublication() == book.getYearOfPublication() && Objects.equals(getTitle(), book.getTitle()) && getKind() == book.getKind() && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getYearOfPublication(), getKind(), getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", kind=" + kind +
                ", author=" + author +
                '}';
    }
}
