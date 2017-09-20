package builder_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CoffeeDirector {
    private CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }

    public void buildCoffee() throws ClassNotFoundException {
        // build each part, call
        coffeeBuilder.addCream();
        coffeeBuilder.addHoney();
        coffeeBuilder.setBlend();
        coffeeBuilder.setMilk();
        coffeeBuilder.sugarTeaspoons();
    }

    public CoffeeBuilder getCoffeeBuilder() {
        return this.coffeeBuilder; // return the product
    }
}
