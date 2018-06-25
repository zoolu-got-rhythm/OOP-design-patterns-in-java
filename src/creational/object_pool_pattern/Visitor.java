package creational.object_pool_pattern;

// vistor pattern super
public class Visitor {
    private Boolean inUse = false;

    Visitor(){}

    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }
}
