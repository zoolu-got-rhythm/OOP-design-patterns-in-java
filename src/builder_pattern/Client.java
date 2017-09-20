package builder_pattern;

/**
 * Created by Slime on 04/09/2017.
 */
public class Client {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector(new LatteBuilder());
        try {
            coffeeDirector.buildCoffee();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
