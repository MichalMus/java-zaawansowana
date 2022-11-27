package ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania;

import ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd2.Book;
import ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd2.BookRepository;
import ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd2.NoBookFoundException;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {
        Book b1 = new Book("11", "Władca Pierścieni", "Adam", 1990);
        Book b2 = new Book("22", "Harry Potter", "Adam", 1999);
        Book b3 = new Book("33", "Zwiadowcy", "Michał", 2000);
        Book b4 = new Book("44", "Niebo ze stali", "Michał", 2200);
        Book b5 = new Book("55", "Jack Reacher", "Julia", 1820);
        Book b6 = new Book("66", "Nędzincy", "Sylwia", 1720);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addNewBook(b1);
        bookRepository.addNewBook(b2);
        bookRepository.addNewBook(b3);
        bookRepository.addNewBook(b4);
        bookRepository.addNewBook(b5);
        bookRepository.addNewBook(b6);
        bookRepository.addNewBook(new Book("77", "Kimo", "Tomek", 2222));

        bookRepository.deleteBook("77");
        bookRepository.showBook();
        System.out.println(bookRepository.searchBookByISBN("22"));
        System.out.println(bookRepository.serachBookByName("Michał"));
    }
}
