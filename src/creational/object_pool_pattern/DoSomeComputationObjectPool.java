package creational.object_pool_pattern;

import java.util.ArrayList;
import java.util.List;

// re-usable could be a jdbc driver pool, use case to make pools generic?
public class DoSomeComputationObjectPool {
    public static final int POOL_SIZE = 5;
    private static List<Visitor> objPool;


    // protected mean
    private static DoSomeComputationObjectPool instance = null;

    public synchronized static DoSomeComputationObjectPool getInstance(){
        if(instance == null){
            instance = new DoSomeComputationObjectPool();
            objPool = new ArrayList<>();
        }

        return instance;
    }

    public synchronized Visitor aquireVisitor(){
        for(Visitor obj: this.objPool){
            if(!obj.getInUse()){
                obj.setInUse(true);
                return obj; 
            }
        }

        if(this.objPool.size() < POOL_SIZE) {
            Visitor visitor = new DoSomeComputation();
            visitor.setInUse(true);
            this.objPool.add(visitor);
            return visitor;
        }
        return null;
    }

    public synchronized void releaseVisitor(Visitor visitor){
        if(visitor.getInUse()){
            int indexOfVisitor = this.objPool.indexOf(visitor);
            this.objPool.get(indexOfVisitor).setInUse(false);
        }
    }

}
