package prototype_pattern;

public class Client {
    public static void main(String[] args) {
        Cat tricky = new Cat("siamese");
        tricky.getOlder();
        tricky.getOlder();

        printAnimalInfo(tricky);

        Cat trickyTwin = tricky.makeCopy();

        printAnimalInfo(trickyTwin);

    }

    public static void printAnimalInfo(Cat animal){
        System.out.println(animal.getClass());
        System.out.println(animal.getSpecies());
        System.out.println(animal.getAge());
        System.out.println(animal.hashCode());
    }
}
