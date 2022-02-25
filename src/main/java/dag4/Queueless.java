package dag4;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queueless {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("blabla");
        queue.add("bla");
        queue.remove();
    }
}
