package builder_pattern;

public class LatteBuilder implements CoffeeBuilder{

    private String blend;
    private String milk;
    private boolean hasCream = false;
    private boolean hasHoney = false;
    private int sugar = 0;


    public LatteBuilder() {
    }


    // encapsulate setter 'params' to the concrete builder class so client doesn't need to -
    // know details
    @Override
    public void setBlend() {
        this.blend = "arabic";
    }

    @Override
    public void setMilk() {
        this.milk = "blue top";
    }

    @Override
    public void addCream() {
        this.hasCream = false;
    }

    @Override
    public void addHoney() {
        this.hasHoney = true;
    }

    @Override
    public void sugarTeaspoons() {
        this.sugar = 0;
    }

    @Override
    public CoffeeBuilder getCoffee() {
        return this;
    }


}
