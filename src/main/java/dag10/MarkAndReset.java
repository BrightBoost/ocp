package dag10;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MarkAndReset {

    public static void main(String[] args) {

        try (Reader r = new BufferedReader(new FileReader("example/message/log.txt"))) {
            if (r.markSupported()) {
                BufferedReader in = (BufferedReader) r;
                System.out.print(in.readLine());
                in.mark(2);
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                in.reset();
                System.out.print(in.readLine());
                in.reset();
                System.out.println(in.readLine());
            }else{
                System.out.println("Mark Not Supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}