package generics;

import java.util.List;

/**
 * Created by Slime on 03/09/2017.
 */
public class GenMethods {
    public void x(Class<?> clazz){
        clazz.getName();
    }

    // <?> is same as ? extends object, it's shorthand
    public void y(List<?> someList){
        someList.forEach((v) -> {
            System.out.println(v);
        });
    }

    public <T extends Comparable<T>> boolean genericPrimitiveCompare(T t, T t2){
        if(t.compareTo(t2) > 0){
            return true;
        }else{
            return false;
        }
    }
}


