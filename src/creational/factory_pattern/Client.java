package creational.factory_pattern;

import java.util.Scanner;

/**
 * Created by Slime on 02/09/2017.
 */
public class Client {
    public static void main(String[] args) {
        CreatureFactory creatureFactory = CreatureFactory.getInstance();

        Creature prevCreature = null;

        Scanner scanner = new Scanner(System.in);
        while(true){
            String userInput = scanner.nextLine();
            Creature c = creatureFactory.createCreature(Integer.parseInt(userInput));
            if(c == null) // catching scenario's: defensive programming?
                continue;

            c.chase(prevCreature);
            c.move();
            prevCreature = c;
        }
    }
}
