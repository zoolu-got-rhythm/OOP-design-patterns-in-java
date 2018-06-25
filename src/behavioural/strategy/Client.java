package behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        SomeContext someThing = new SomeContext();
        // switch an objects behaviour at runtime
        someThing.setSomeStrategyImplementationVariation(new ConcreteStategyA());
        someThing.executeCurrentStrategyBehaviour();
        someThing.setSomeStrategyImplementationVariation(new ConcreteStategyB());
        someThing.executeCurrentStrategyBehaviour();
    }
}

interface Strategy{
    public String someBehaviour();
}

class ConcreteStategyA implements Strategy{
    @Override
    public String someBehaviour() {
        return "algorithm 1";
    }
}

class ConcreteStategyB implements Strategy{
    @Override
    public String someBehaviour() {
        return "algorithm 2";
    }
}

class SomeContext{
    private Strategy someStrategyImplementationVariation;

    SomeContext(){}

    public void executeCurrentStrategyBehaviour(){
        System.out.println(this.someStrategyImplementationVariation.someBehaviour());
    }

    public Strategy getSomeStrategyImplementationVariation() {
        return someStrategyImplementationVariation;
    }

    public void setSomeStrategyImplementationVariation(Strategy someStrategyImplementationVariation) {
        this.someStrategyImplementationVariation = someStrategyImplementationVariation;
    }
}
