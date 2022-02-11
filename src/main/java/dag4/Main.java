package dag4;

import dag2.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Cat> comparingDateOfBirth = (c1, c2) ->
            c1.getLocalDate().compareTo(c2.getLocalDate());
        List<Cat> list = new ArrayList<>();
        //sort list
        list.sort(comparingDateOfBirth);
        //sort list
        Collections.sort(list, comparingDateOfBirth);
    }
}
