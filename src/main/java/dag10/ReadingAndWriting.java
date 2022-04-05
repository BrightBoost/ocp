package dag10;

import java.io.*;
import java.util.stream.Collectors;

public class ReadingAndWriting implements Serializable {
    public static void main(String[] args) {
        // schrijven
        try(FileWriter fileWriter = new FileWriter("./voorbeeld/log.txt", true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            bufferedWriter.write("Wees eens creatief\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lezen middeleeuwse stijl
        try(FileReader fileReader = new FileReader("./voorbeeld/log.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuilder fileContent = new StringBuilder();
            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                fileContent.append(line + "\n");
            }
            System.out.println(fileContent.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }

        // lezen Java 8 stijl
        try(FileReader fileReader = new FileReader("./voorbeeld/log.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String content = bufferedReader.lines().collect(Collectors.joining("-over-\n"));
            System.out.println(content + "-over en uit-");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
