package dag3;


public class NotSoImmutableChild extends NotSoImmutable {
    private Animal animal;
    public NotSoImmutableChild(Animal a) {
        super(a);
        animal = a;
    }

    // oh no
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
