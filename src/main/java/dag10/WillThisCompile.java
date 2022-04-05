package dag10;

import java.io.*;

public class WillThisCompile implements Serializable {
    @Serial
    private static final long serialVersionUID = 12345;
    private char blabla;
    private ReadingAndWriting readingAndWriting;

    public WillThisCompile(ReadingAndWriting readingAndWriting) {
        this.readingAndWriting = readingAndWriting;
    }

    public ReadingAndWriting getReadingAndWriting() {
        return readingAndWriting;
    }

    public void setReadingAndWriting(ReadingAndWriting readingAndWriting) {
        this.readingAndWriting = readingAndWriting;
    }

    public static void main(String[] args) {
        WillThisCompile wtc = new WillThisCompile(new ReadingAndWriting());
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./objectout.txt"))) {
            oos.writeObject(wtc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
