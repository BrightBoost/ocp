package dag15;

public sealed class Verzegeld permits Onverzegeld {

}

non-sealed class Onverzegeld extends Verzegeld {

}

class RandomOtherClass extends Onverzegeld {}