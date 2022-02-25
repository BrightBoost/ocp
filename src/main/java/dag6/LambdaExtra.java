package dag6;

public class LambdaExtra {
    public static void main(String[] args) {
        // algemene syntax: (input) -> output;
        // ** geen geen
        FunctionalInterfaceGeenInputGeenOutput fgg = () -> System.out.println(8);

        // bij meerdere statements moet je {} gebruiken
        FunctionalInterfaceGeenInputGeenOutput fgg2 = () -> {
            System.out.println("blabla");
            System.out.println("meer blabla");
        };

        // ** wel wel
        FunctionalInterfaceWelOutputWelInput fww = (int x) -> x + 4;

        // bij {} moet je return gebruiken
        FunctionalInterfaceWelOutputWelInput fww2 = (int x) -> {return x + 4;};

        // bij 1 param input mag je haakjes weglaten (dan moet je type weglaten)
        FunctionalInterfaceWelOutputWelInput fww3 = x -> x + 4;

        // ** wel 2 wel
        FunctionalInterfaceWelOutputMultipleInput fwm = (x, y) -> 42;
        // bij noemen type van 1 param, moet dat ook bij tweede
        FunctionalInterfaceWelOutputMultipleInput fwm2 = (int x, int y) -> 42;
        // bij 1 var, alles var
        FunctionalInterfaceWelOutputMultipleInput fwm3 = (var x, var y) -> 42;


        // ** geen out wel in
        FunctionalInterfaceGeenOutputWelInput fgw = x -> System.out.println("of zoiets");

        // ** wel out geen in
        FunctionalInterfaceWelOutputGeenInput fwg = () -> 42;

        // ** wel out wel in en type params
        FunctionalInterfaceTypeParamsWelOutputWelInput<Integer, Integer> ftpww = x -> 42;

        // gebruik van type params
        FunctionalInterfaceTypeParamsWelOutputWelInput<Integer, Integer> ftpww2 = x -> x.intValue();

        functionalInterfaceAsParam(fwg);
    }

    public static void functionalInterfaceAsParam(FunctionalInterfaceWelOutputGeenInput fwg) {
        System.out.println(fwg.fun());
    }
}
