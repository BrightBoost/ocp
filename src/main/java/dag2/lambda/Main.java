package dag2.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Calculate c = new Calculate() {
            @Override
            public double calc(double x, double y) {
                return x + y;
            }
        };

        Calculate c1 = (x, y) -> x + y;

        Calculate c2 = (x, y) -> {
            System.out.println("blabla");
            return x + y;
        };

        Print p = s -> System.out.println(s);

        p.print("blabla");

        List<String> lijst = new ArrayList<>(Arrays.asList("Benjamin", "Jolanda", "Jinge"));

        long i = lijst.stream()
                .filter(s -> s.startsWith("J"))
                .count();
        System.out.println(i);
        System.out.println(lijst);

    }

    public static void printer(Print p) {
        p.print("in de method printer");
    }
}
