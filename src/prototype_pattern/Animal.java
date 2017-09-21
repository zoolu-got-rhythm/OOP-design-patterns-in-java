package prototype_pattern;

public class Animal{
    private String species;
    private int age;

    public Animal(String species){
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

}
