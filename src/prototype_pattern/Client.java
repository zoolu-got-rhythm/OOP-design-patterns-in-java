package prototype_pattern;

public class Client {
    public static void main(String[] args) {
        Animal tricky = new Cat("siamese");
        tricky.getOlder();
        tricky.getOlder();
        printAnimalInfo(tricky);

        Animal trickyTwin = tricky.makeCopy();
        printAnimalInfo(tricky);
    }

    public static void printAnimalInfo(Animal animal){
        System.out.println(animal.getClass());
        System.out.println(animal.getSpecies());
        System.out.println(animal.getAge());
        System.out.println(animal.hashCode());
    }
}
