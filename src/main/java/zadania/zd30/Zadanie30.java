package zadania.zd30;//package zadania.zd30;
//
//
//import java.io.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Zadanie30 {
//    public static void main(String[] args) throws IOException {
//
//            var filename = "zadanie30";
//
//            Zadanie30 zadanie30 = new Zadanie30();
//
//            //odczytanie pliku
//            var list = zadanie30.readByBufferedReader(filename);
//
//            //odwrócenie listy
////       var list2 = System.out.println(zadanie30.newList(list));
//
//
//            //zapis pliku
//            zadanie30.writeByBufferedWriter(list2, "zadanie30-write");
//        }
//
//
//    public void readFileByScanner() throws FileNotFoundException {
//        File file = new File("src/main/resources/zadanie30");
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();
//    }
//
//    public void readFileByFileReader() throws IOException {
//        FileReader fileReader = new FileReader("src/main/resources/zadanie30");
//        System.out.println(fileReader.read());
//
//    }
//
//    public List<String> readByBufferedReader(String fileName) {
//        List<String> lines = new ArrayList<>();
//        try (BufferedReader bufferedReader =
//                     new BufferedReader(new FileReader("src/main/resources/" + fileName))) {
//            boolean read = true;
//            while (read) {
//                var line = bufferedReader.readLine();
//                if (line == null) {
//                    read = false;
//                } else {
//                    lines.add(line);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Wystąpił błąd podczas czytania pliku");
//            e.printStackTrace();
//        }
//        return lines;
//    }
//
//    public void writeByBufferedWriter(List<String> lines, String fileName) {
//        try(BufferedWriter bufferedWriter =
//                    new BufferedWriter(new FileWriter("src/main/resources/" + fileName))) {
//            for (String line : lines) {
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Wystąpił błąd przy zapisie pliku");
//            e.printStackTrace();
//        }
//    }
//
//    public List<char[]> newList (List<String> a){
//        List<char[]> char2 = new ArrayList<>();
//        List<char[]> charExmp = a.stream()
//                .map(b -> b.toCharArray()).toList();
//
//        for(int i = charExmp.size() -1; i>=0 ;i-- ){
//            char2.add(charExmp.get(i));
//        }
//        return char2;
//    }
//
//}