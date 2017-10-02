package creational.object_pool_pattern;

import java.util.ArrayList;
import java.util.List;

// re-usable
public class Pool {
    public static final int POOL_SIZE = 5;
    List<Obj> objPool;


    // protected mean
    private static Pool instance = null;

    public Pool getInstance(){
        if(instance == null){
            instance = new Pool();
            objPool = new ArrayList<>();
        }

        return instance;
    }

    public Obj aquireVisitor(){
        for(Obj obj: this.objPool){
            if(!obj.inUse){
                obj.setInUse(true);
                return obj; 
            }
        }
    }




}
