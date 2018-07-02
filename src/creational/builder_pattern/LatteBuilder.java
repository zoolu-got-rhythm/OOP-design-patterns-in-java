package creational.builder_pattern;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// could extend fields instead, and override methods
public class LatteBuilder implements CoffeeBuilder{

    private String blend;
    private String milk;
    private boolean hasCream;
    private boolean hasHoney;
    private int sugar;


    public LatteBuilder() {
    }


    // encapsulate setter 'params' to the concrete builder class so client doesn't need to -
    // know details
    @Override
    public void buildBlend() {
        this.blend = "arabic";
    }

    @Override
    public void buildMilk() {
        this.milk = "blue top";
    }

    @Override
    public void buildCream() {
        this.hasCream = false;
    }

    @Override
    public void buildHoney() {
        this.hasHoney = true;
    }

    @Override
    public void buildSugars() {
        this.sugar = 0;
    }

    @Override
    public CoffeeBuilder getCoffee() {
        return this;
    }


    public String getBlend() {
        return blend;
    }

    public String getMilk() {
        return milk;
    }

    public boolean isHasCream() {
        return hasCream;
    }

    public boolean isHasHoney() {
        return hasHoney;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Field f : this.getClass().getDeclaredFields()){
            if (Modifier.isPrivate(f.getModifiers()))
                f.setAccessible(true);
            s.append(f.getName());
            s.append(": ");
            try {
                s.append(f.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            s.append("\n");
        }
        return s.toString();
    }
}
