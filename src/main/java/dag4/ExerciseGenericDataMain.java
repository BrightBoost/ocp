package dag4;


import java.util.List;

public class ExerciseGenericDataMain {
//    Make a new class Bag that takes a generic type T
//    Add a class Groceries
//In a main method, instantiate a bag and specify Groceries as the type
//    Make a list of groceries and create a bag using these groceries
//    Make a new method to unpack groceries that takes a bag as parameter and returns each item as an object of type Groceries
//
//    Run the program and look into the target folder, how does it deal with the generic type?

    public static void main(String[] args) {
        Bag<Groceries> boodschappenTas = new Bag<>();
        Bag<List<Groceries>> groteBoodschappenTas = new Bag<>();

        //de boodschappenTas voldoet aan de signature parameter van de static unpack onderstaand
        unpack(boodschappenTas);
        //deze weet dat ie een lijst terug krijgt, dankzij de generic
        groteBoodschappenTas.unpack().get(0);
    }

    public static Groceries unpack(Bag<Groceries> b) {
        return b.unpack();
    }
}
