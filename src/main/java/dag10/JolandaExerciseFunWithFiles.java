package dag10;

import java.io.File;
import java.io.IOException;

public class JolandaExerciseFunWithFiles {
    public static void main(String[] args) throws IOException {
        File bestand = new File("./voorbeeld/log.txt");
        if (!bestand.exists()) {
            bestand.getParentFile().mkdirs();
            bestand.createNewFile();
        }

        File bestand2 = new File(bestand.getParent() + System.getProperty("file.separator") + "messages/msg.txt");

        if (!bestand2.exists()) {
            bestand2.getParentFile().mkdirs();
            bestand2.createNewFile();
        }

        System.out.println(bestand2.getAbsolutePath());
    }

}
