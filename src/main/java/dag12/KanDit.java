package dag12;

import java.io.FileWriter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class KanDit {

    public static void main(String[] args) throws Exception {
//        AtomicInteger ai = new AtomicInteger();
//        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a",
//                "merry", "old", "soul").parallel();
//        stream.filter( e->{
//            ai.incrementAndGet();
//            return e.contains("o");
//        }).allMatch(x->x.indexOf("o")>0);
//
//        System.out.println("AI = "+ai);


//        boolean b1 = false;
//        int i1 = 2;
//        int i2 = 3;
//        if (b1 = i1 == i2){
//            System.out.println("true");
//        } else{
//            System.out.println("false");
//        }

        var fw = new FileWriter("text.txt");
        // fw.write("hello"); //1
        fw.close();
    }
}

