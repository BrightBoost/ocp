package dag4;

import java.util.Collection;

public class Bounds {
    //lower bound, String is the minimum level that's allowed
    //accepts String and parents of String
    public static void printStuff(Collection<? super String> collection) {

    }

    //upper bound
    //accepts String and (nonexisting) subclasses of String
    public static void printOtherStuff(Collection<? extends String> collection) {

    }

}
