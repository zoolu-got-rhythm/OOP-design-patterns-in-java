package builder_pattern;

public interface CoffeeBuilder {
    void setBlend();
    void setMilk();
    void addCream();
    void addHoney();
    void sugarTeaspoons();
    CoffeeBuilder getCoffee();
}
