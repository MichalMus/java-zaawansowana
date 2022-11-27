package ZadaniaJavaZaawansowanaPlik.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zd4 {
    public static void main(String[] args) throws IOException {

        Zd4 zd = new Zd4();
//        System.out.println(zd.finfLongestWord());
//       zd.finfLongestWord2();
        zd.findTheLongestWord3();

    }

    ////pierwszy mój sposób - nieudany
    public String finfLongestWord() throws FileNotFoundException {
        String longestWord = "";
        String current;
        Scanner scanner = new Scanner("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30");
        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        return longestWord;
    }

    ///drugi mój sposób - nieudany
    public String finfLongestWord2() throws IOException {
        String longestmy = "";
        String simple;
        while ((simple = Files.readString(Path.of
                ("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30"))) != null) {
            if (longestmy.length() < simple.length()) {
                longestmy = simple;
            }
        }
        return longestmy.toString();
    }

    ////trzeci sposób
    public void findTheLongestWord3() throws IOException {
        Path path = Paths.get("src/main/resources/zadanie30");
        List<String> lines = Files.readAllLines(path);
        findTheLongestWordbasic(lines.toString());

    }
    ////ale to się udało
    public String findTheLongestWordbasic(String value) {
        String[] data = value.split(",");
        String longestword = "";
        for (String s : data) {
            if (longestword.length() < s.length()) {
                longestword = s;
            }
        }
        System.out.println(longestword);
        return longestword;

    }

}
