package ZadaniaJavaZaawansowanaPlik.Wyjątki_zadania.zd2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {



    private List<Book> books = new ArrayList<>();

    public void addNewBook(Book newBook) {
        this.books.add(newBook);
    }

    public void deleteBook(String isbn) throws NoBookFoundException {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
                return;
            }
        }
        throw new NoBookFoundException("Cant delete book with isbn: " + isbn);
    }

    public Book searchBookByISBN(String isbn) throws NoBookFoundException{
        for (Book b: books){
            if(b.getIsbn().equals(isbn)){
               return b;
            }
        }
        throw new NoBookFoundException("Nie można znależć książki o nr:  " + isbn);
    }

   public List<Book> serachBookByName(String name) throws NoBookFoundException{
        List<Book> booksByNames = new ArrayList<>();
        for (Book b: books) {
            if(b.getAuthor().equals(name)){
                booksByNames.add(b);
            }
        }
        if (booksByNames.isEmpty()){
            throw new NoBookFoundException("Nie znaleziono książek autora: " + name);
        }
       return booksByNames;
   }

   public void showBook(){
        for(Book b : books){
            System.out.println(b);
        }
   }


}
