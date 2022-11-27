package ZadaniaJavaZaawansowanaPlik.IO;

import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Zd1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Komputer PC/Desktop/programowanie");
//        List<String> list = Arrays.asList(file.list());
        String[] list = file.list();
        for(String name : list){
            System.out.println(name);

        }

    }
}
