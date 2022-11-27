package ZadaniaJavaZaawansowanaPlik.IO.zd6;//package ZadaniaJavaZaawansowanaPlik.IO.zd6;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Zd6 {
//    public static void main(String[] args) throws IOException {
//        MovieFileRepository movieFileRepository = new MovieFileRepository();
//        movieFileRepository.add(new Movie("Matrix","Wachowscy","SiFi",1999));
//        movieFileRepository.add(new Movie("mumia","NoName","SiFi",2000));
//        System.out.println("Results: " + movieFileRepository.getAll());
//
//
//    }
//}
//
//class MovieFileRepository{
//    private final MovieParser movieParser = new MovieParser();
//    private final static Path PATH = Paths.get("src/main/resources/zadanie30");
//    public void add(Movie movie) throws IOException {
//        Files.writeString(PATH, movieParser.toCSV(movie), StandardOpenOption.APPEND);
//
//    }
//    public List<Movie> getAll() throws IOException{
//        List<String> movieLines = Files.readAllLines(PATH);
//        List<Movie> movies = new ArrayList<>();
//        for (String s : movieLines){
//            Movie movie = movieParser.fromCSV(s);
//            movies.add(movie);
//        }
//        return movies;
//    }
//
//
//
//}
