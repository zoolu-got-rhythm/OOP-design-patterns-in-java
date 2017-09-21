package prototype_pattern;

public class Dog implements Prototype {
    private String species;
    public Dog(String species) {
        this.species = species;
    }

    public Dog makeCopy() {
        Dog copy = null;
        try {
            copy = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}
