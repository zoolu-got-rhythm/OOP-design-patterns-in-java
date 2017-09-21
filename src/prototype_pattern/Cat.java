package prototype_pattern;

public class Cat extends Animal implements Prototype{
    public Cat(String species) {
        super(species);
    }

    @Override
    public Animal makeCopy() {
        Animal copy = null;
        try {
            copy = (Cat) super.();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
    }
}
