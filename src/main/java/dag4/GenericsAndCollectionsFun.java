package dag4;

import java.util.Arrays;
import java.util.List;

public class GenericsAndCollectionsFun {
    public static void main(String[] args) {
        String[] array = {"hoi", "hi", "hallo"};
        List<String> list = Arrays.asList(array);
        list.set(1, "greetings of the day");
        System.out.println(array[1]);
    }
}
