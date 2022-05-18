package dag15;

import java.io.Serializable;
import java.util.Arrays;

@FunctionalInterface
interface Calculator extends AutoCloseable {
    double calc(double ... x);

    default void close() {}
}

public class RepeatLambdas {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double calc(double... x) {
                return Arrays.stream(x).sum();
            }
        };
        System.out.println(calculator.calc(1.2, 3.4, 222.4));


        Calculator c2 = (double...x) -> Arrays.stream(x).sum();

    }
}
