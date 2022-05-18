package dag15;

import java.util.List;
import java.util.stream.Stream;

public class Npe {
    public static void main(String[] args) {
        List<String> list = Stream.of("hoi", "martijn", null).map(x -> x).filter(x -> !x.equals("blabla")).toList();
    }
}
