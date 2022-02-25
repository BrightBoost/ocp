package dag5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferencesExamples {

    public MethodReferencesExamples() {
        int ok = 43434;
        long ookOk = 345345;
//        long nietOk = 12345678988;
    }

    // constructor to demonstrate method ref constructor with argument
    public MethodReferencesExamples(int x) {

    }

    public static void main(String[] args) {
        // static methods
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list2.add(list);
        list2.add(list);
        list2.add(list);

        //zonder method ref
        list2.stream().forEach(l -> Collections.sort(l));
        //met
        list2.stream().forEach(Collections::sort);


        // instance methods on a specific instance
        // also possible on this and super
        String s = "Goedemorgen!";
        Supplier<Boolean> lambda = () -> s.isEmpty();
        Supplier<Boolean> methodRef = s::isEmpty;

        // instance methods on an instance that will be known during runtime
        Predicate<String> lambdaPred = str -> str.isEmpty();
        Predicate<String> lambdaRef = String::isEmpty;

        // constructors
        Supplier<MethodReferencesExamples> suppLambda = () -> new MethodReferencesExamples();
        Supplier<MethodReferencesExamples> suppRef = MethodReferencesExamples::new;

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);

        Function<Integer, MethodReferencesExamples> funRef = MethodReferencesExamples::new;
        list3.stream().map(funRef).collect(Collectors.toList());
        list3.stream().map(MethodReferencesExamples::new).collect(Collectors.toList());

        //mag niet, want suppRef gebruikt geen argumenten en is van type Supplier
        //list3.stream().map(suppRef).collect(Collectors.toList());

    }
}
