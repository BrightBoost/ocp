package dag6;

import java.util.Optional;

public class OptionalNotOptional {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = maybeInteger();
        System.out.println(optionalInteger);
        System.out.println(optionalInteger.orElse(5));
        System.out.println(optionalInteger.orElseGet(() -> {
            System.out.println("blabla");
            return 4;
        }));
    }

    public static Optional<Integer> maybeInteger() {
        if(Math.random() > 0.5) {
            return Optional.of(3);
        } else {
            return Optional.empty();
        }
    }
}
