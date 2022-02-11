package dag4;

import dag2.A;

import java.util.ArrayList;
import java.util.List;

public class VoorbeeldMethodGeneric {
    public static <T> List<T> createStuff(T t) {
        System.out.println("ge");
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    public static List<String> createStuff(String t) {
        System.out.println("string");
        List<String> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    public static List<Integer> createStuff(Integer t) {
        System.out.println("int");
        List<Integer> list = new ArrayList<>();
        list.add(t);
        return list;
    }
    public static void main(String[] args) {
        List<String> lijstje = VoorbeeldMethodGeneric.<String>createStuff("s");
        List<Integer> lijstje2 = VoorbeeldMethodGeneric.<Integer>createStuff(3);

    }
}
