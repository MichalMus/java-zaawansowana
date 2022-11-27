package ZadaniaJavaZaawansowanaPlik.IO.zd5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Zd5 {
    public static void main(String[] args) throws IOException {


        UserParser userParser = new UserParser();
        Path path = Paths.get("src/main/resources/zadanie30-write");
        List<User> users = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        for (String s : lines) {
            User user = userParser.fromCSV(s);
            users.add(user);

        }
        System.out.println(users);


    }
}
