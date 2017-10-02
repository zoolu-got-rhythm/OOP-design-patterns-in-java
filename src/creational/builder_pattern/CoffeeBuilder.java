package creational.builder_pattern;

public interface CoffeeBuilder {
    void buildBlend();
    void buildMilk();
    void buildCream();
    void buildHoney();
    void buildSugars();
    CoffeeBuilder getCoffee();
}
