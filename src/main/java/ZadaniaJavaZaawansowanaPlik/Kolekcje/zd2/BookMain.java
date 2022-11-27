package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd2;

import java.util.ArrayList;
import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        Author a1 = new Author("Adam","Adamowicz","male");
        Author a2 = new Author("Beata","Tyszkiewicz","female");
        Author a3 = new Author("Karolina","Kika","female");
        Author a4 = new Author("Michał","Mus","male");

        Book b1 = new Book("book1",25.0f,1999,GenreOfBook.PSYCHOLOGIST, Arrays.asList(a1));
        Book b2 = new Book("book2",45.0f,2000,GenreOfBook.ADVENTURE, Arrays.asList(a2));
        Book b3 = new Book("book3",16.0f,2002,GenreOfBook.CRIMINAL, Arrays.asList(a3));

        BookService bs = new BookService();
        bs.addBook(b1);
        bs.addBook(b2);
        bs.addBook(b3);

        System.out.println(bs.findBooksByAuthor(a1));
        System.out.println(bs.displayAllBooks());
        System.out.println(bs.showChipestBook());

    }
}
