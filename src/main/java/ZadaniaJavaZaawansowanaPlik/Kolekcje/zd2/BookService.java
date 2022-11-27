package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd2;

import java.util.*;
import java.util.function.ToDoubleFunction;

public class BookService {
    private List<Book> nbl = new ArrayList<>();

    public void addBook(Book book) {
        nbl.add(book);
    }

    public void removeBook(Book book) {
        nbl.remove(book);
    }

    public void removeBookByTitle(String title) {
        for (Book sb : nbl) {
            if (sb.getTitle().equals(title)) {
                nbl.remove(sb);
            }
        }
    }

    public List<Book> displayAllBooks() {
        return nbl;
    }

    public List<Book> showBooksByKind(GenreOfBook genere) {
        List<Book> results = new ArrayList<Book>();
        for (Book b : nbl) {
            if (b.getKind().equals(genere)) {
                results.add(b);
            }
        }
        return results;
    }

    public List<Book> showBooksByYear(int year) {
        List<Book> results = new ArrayList<Book>();
        for (Book b : nbl) {
            if (b.getYearOfPublication() < year) {
                results.add(b);
            }
        }
        return results;
    }

    public Book showMostExpensiveBook() {
        Book exp = null;
        for (Book b : nbl) {
            if (exp == null || exp.getPrice() < b.getPrice()) {
                exp = b;
            }
        }
        return exp;
    }

    public Book showChipestBook() {
        Book chipest = null;
        for (Book b : nbl) {
            if (chipest == null || chipest.getPrice() > b.getPrice()) {
                chipest = b;
            }
        }
        return chipest;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        List<Book> results = new ArrayList<>();
        for (Book b : nbl) {
            if (b.getAuthor().size() == numberOfAuthors) {
                results.add(b);

            }
        }
        return results;
    }

//    public List<Book> sortByTitleAsc() {
//        Collections.sort(nbl);
//        return nbl;
//    }


    public List<Book> sortByTitleDsc() {
        Collections.reverse(nbl);
        return nbl;
    }

    public boolean isBookInRepo(Book book) {
        return nbl.contains(book);
    }

    public List<Book> findBooksByAuthor(Author author) {
        List<Book> results = new ArrayList<>();
        for (Book b : nbl) {
            if (b.getAuthor().contains(author)) {
                results.add(b);
            }
        }
        return results;

    }

    //// zadanie 4
    public Map<GenreOfBook, String> metodazd4() {
        Map<GenreOfBook, String> nm = new HashMap<>();
        for (Book b : nbl) {
            nm.put(b.getKind(), b.getTitle());
        }
        return nm;
    }

    ////zadanie5

    public Stack<Book> listBookbyPrice(){
        Collections.sort(nbl,Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return value.getPrice();
            }
        }));
        Stack<Book> bookstack = new Stack<>();
        for (Book b : nbl){
            bookstack.push(b);
        }
        return bookstack;
    }



}

