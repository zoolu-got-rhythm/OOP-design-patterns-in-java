package builder_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Slime on 04/09/2017.
 */
public class Client {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector(new LatteBuilder());
        CoffeeBuilder latte = coffeeDirector.getCoffeeBuilder();
        System.out.println(latte);

        for(Method m : latte.getClass().getMethods()){
            if(m.getName().contains("build")){
                System.out.println("calling: " + m.getName());
                try {
                    m.invoke(latte, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
