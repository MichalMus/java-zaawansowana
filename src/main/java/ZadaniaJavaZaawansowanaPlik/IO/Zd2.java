package ZadaniaJavaZaawansowanaPlik.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Zd2 {
    public static void main(String[] args) throws IOException {

        //1
        Path path = Paths.get("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30");
        System.out.println(Files.readAllLines(path));


        //2
        BufferedReader bufferedReader = new BufferedReader(new FileReader
                ("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30"));
        List<String> list1 = bufferedReader.lines().toList();
        for (String s : list1) {
            System.out.println(s);
            bufferedReader.close();
        }

        //3
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader
                    ("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30"));
            String lineInWriter = "null";
            while ((lineInWriter = bufferedReader2.readLine()) != null) {
                System.out.println(lineInWriter);
            }
            bufferedReader2.close();
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku");
        }
    }
}
