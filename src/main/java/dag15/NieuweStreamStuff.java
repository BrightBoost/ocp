package dag15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NieuweStreamStuff {
    public static void main(String[] args) {
        List<Integer> list1 = Stream.of(2, 3, 4,5, 6, 7, 7).filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(2, 3, 4,5, 6, 7, 7).filter(x -> x % 2 == 0).toList();

    }
}
