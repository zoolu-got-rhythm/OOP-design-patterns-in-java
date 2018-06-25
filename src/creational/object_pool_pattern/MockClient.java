package creational.object_pool_pattern;

// rename to mockClient
public class MockClient extends Thread{

    private DoSomeComputation v;
    private DoSomeComputationObjectPool p;
    private Computation cInterface;

    MockClient(DoSomeComputationObjectPool p, Computation c){
        this.p = p;
        this.cInterface = c;
    }

    @Override
    public void run(){
        while(true){
            this.v = (DoSomeComputation) p.aquireVisitor();
            if(this.v != null){
                System.out.println(this.v.hashCode());
                this.v.someCompution(this.cInterface);
                System.out.println("releasing");
                p.releaseVisitor(this.v);
                break;
            }
        }
    }
}
