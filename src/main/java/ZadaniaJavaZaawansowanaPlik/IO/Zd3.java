package ZadaniaJavaZaawansowanaPlik.IO;

import java.io.*;

public class Zd3 {
    public static void main(String[] args) {
        Zd3 zd3 = new Zd3();

        zd3.MyFileWriter("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30","zadanie czwarteeeee");
        zd3.MyFileReader(new File("C:/Users/Komputer PC/IdeaProjects/java-zaawansowana-programowanie/src/main/resources/zadanie30"));


    }

    public void MyFileReader(File toRead) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(toRead));
            String linesInFile;
            while ((linesInFile = bufferedReader.readLine()) != null) {
                System.out.println(linesInFile);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Problem z odczytem: " + e.getStackTrace());
        }
    }

    public void MyFileWriter(String toWrite, String smth) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String emptyLine = "";
            FileWriter fW = new FileWriter(toWrite,true);
            fW.write(smth);
            fW.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(toWrite));
            while(emptyLine != null){
                stringBuilder.append(emptyLine);
                stringBuilder.append(System.lineSeparator());
                emptyLine = bufferedReader.readLine();
                System.out.println(emptyLine);
            }
bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Problem z zapisem " + e.getStackTrace());
        }
    }
}
