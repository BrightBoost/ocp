package dag10;

import java.io.File;
import java.io.IOException;

public class FunWithFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("./example.txt");
        if(file.exists()) {
            System.out.println("He's real!");
        } else {
            System.out.println("It's a myth...");
            file.getParentFile().mkdirs();
            file.createNewFile();
        }


        if(file.exists()) {
            System.out.println("He's real!");
        } else {
            System.out.println("It's a myth...");
            file.mkdirs();
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParentFile());

        if(file.isFile()) {
            System.out.println("It's a file!");
        } else if(file.isDirectory()) {
            System.out.println("It's a directory:");
            File[] files = file.listFiles();
            for(File f : files) {
                System.out.println(f.getAbsolutePath());
            }
        } else {
            System.out.println("It's a plane!");
        }




    }
}
