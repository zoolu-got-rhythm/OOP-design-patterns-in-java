package creational.prototype_pattern;

public class Cat implements Prototype{
    private String species;
    private int age;

    public Cat(String species) {
        this.species = species;
    }

    public void getOlder(){
        this.age++;
    }

    public int getAge(){
        return this.age;
    }


    public String getSpecies(){
        return this.species;
    }

    public Cat makeCopy() {
        Cat copy = null;
        try {
            copy = (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}
