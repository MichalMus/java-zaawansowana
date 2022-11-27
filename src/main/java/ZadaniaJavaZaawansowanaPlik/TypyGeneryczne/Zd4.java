package ZadaniaJavaZaawansowanaPlik.TypyGeneryczne;

import java.util.*;

public class Zd4 {
    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book("aaa","111"));
        listBook.add(new Book("bbb","222"));
        listBook.add(new Book("ccc","333"));
        Liberary<Book> lb1 = new Liberary<>(listBook);
        System.out.println(lb1.getListOfMedia());
        Liberary<Newspaper> listNewspaper = new Liberary<>(Arrays.asList(new Newspaper("qqq","qqq"),
                new Newspaper("www","www"), new Newspaper("eee","eee")));
        System.out.println(listNewspaper.getListOfMedia());

    }

}

abstract class MediaContent {
    protected String title;

    public MediaContent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Book extends MediaContent {
    private String author;


    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

class Newspaper extends MediaContent {
    private String editor;

    public Newspaper(String title, String editor) {
        super(title);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "editor='" + editor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

class Movie extends MediaContent {
    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

class Liberary<T extends MediaContent> {
    protected T typeOfMedia;
    protected List<T> ListOfMedia;

    public Liberary(List<T> listOfMedia) {
        ListOfMedia = listOfMedia;
    }

    public List<T> getListOfMedia() {
        return ListOfMedia;
    }

    public void setListOfMedia(List<T> listOfMedia) {
        ListOfMedia = listOfMedia;
    }
}





