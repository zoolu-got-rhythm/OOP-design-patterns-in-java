package creational.object_pool_pattern;

public class DoSomeComputation extends Visitor{

    public void someCompution(Computation c){
        c.compute();
    }
}
