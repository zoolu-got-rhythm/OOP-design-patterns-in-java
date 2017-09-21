package prototype_pattern;

public class Dog extends Animal implements Prototype {
    public Dog(String species) {
        super(species);
    }


    @Override
    public Animal makeCopy() {
        Animal copy = null;
        try {
            copy = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}
