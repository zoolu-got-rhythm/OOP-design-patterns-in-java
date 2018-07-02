package creational.builder_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


// could make this a singleton
public class CoffeeDirector {
    private CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }

    public void buildCoffee() throws ClassNotFoundException {
        // build each part, call
        coffeeBuilder.buildCream();
        coffeeBuilder.buildHoney();
        coffeeBuilder.buildBlend();
        coffeeBuilder.buildMilk();
        coffeeBuilder.buildSugars();

        // invoke build methods using reflection instead
//        LatteBuilder lb = null;
//        if(this.coffeeBuilder instanceof LatteBuilder){
//            lb = (LatteBuilder) this.coffeeBuilder;
//        }
//
//        for(Method m : lb.getClass().getMethods()){
//            if(m.getName().contains("build"))
//                try {
//                    m.invoke(m.getName());
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//        }
    }

    public CoffeeBuilder getCoffeeBuilder() {
        return this.coffeeBuilder; // return the product
    }
}
