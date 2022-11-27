package ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd2;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int yearOfPublicate;

    public Book(String isbn, String title, String author, int yearOfPublicate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublicate = yearOfPublicate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublicate() {
        return yearOfPublicate;
    }

    public void setYearOfPublicate(int yearOfPublicate) {
        this.yearOfPublicate = yearOfPublicate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublicate=" + yearOfPublicate +
                '}';
    }
}
