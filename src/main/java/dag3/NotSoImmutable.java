package dag3;

import dag2.A;

public class NotSoImmutable {
    private final Animal maaikesFavoritePet;
    public NotSoImmutable(Animal maaikesFavoritePet) {
//        Animal a = new Animal();
//        a.setName(maaikesFavoritePet.getName());
        this.maaikesFavoritePet = maaikesFavoritePet;//a;
    }
    public final String getMaaikesFavoritePet(){
        return maaikesFavoritePet.getName();
    }
}
