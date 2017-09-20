package builder_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CoffeeDirector {
    private CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }

    public CoffeeBuilder getCoffeeBuilder() {
        return this.coffeeBuilder; // return the product
    }

    public void buildCoffee() throws ClassNotFoundException {
        // build each part, call
        System.out.println(this.coffeeBuilder.getClass().getMethods());
        //Class<?> c = Class.forName("CoffeeDirector"); // < not needed really

        for(Method method : this.coffeeBuilder.getClass().getMethods()){
            System.out.println(method);
            String methodName = method.getName();
            if(methodName.contains("set") || methodName.contains("add") || methodName.contains("sugar")) {
                try {
                    method.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
