package dag4;

import dag2.A;

import java.util.ArrayList;
import java.util.List;

public class What {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(3));
//        List<Object> list2 = list;
//        list2.add("geen integer");

        List<Object> list2 = new ArrayList<>();
        ikHebEenLijstVanIntegersNodig(list2);
    }

    public static void ikHebEenLijstVanIntegersNodig(List<? super Integer> list) {
        list.add(Integer.valueOf(3));
    }
}
