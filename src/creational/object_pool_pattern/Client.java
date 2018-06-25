package creational.object_pool_pattern;

public class Client {
    public static void main(String[] args) {
        DoSomeComputationObjectPool p = DoSomeComputationObjectPool.getInstance();
        DoSomeComputationObjectPool p2 = DoSomeComputationObjectPool.getInstance();
        // check singleton instance is the same
        System.out.println(p == p2);

        for(int j = 0; j < 100; j++) {
            // defer the computation to DoSomeComputaton class
            MockClient mc = new MockClient(p, () -> {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               });
           mc.start();
           System.out.println("starting threads");
        }
    }
}
