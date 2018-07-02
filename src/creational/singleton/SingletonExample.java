package creational.singleton;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample(){}; // can't externally instantiate

    public synchronized static SingletonExample getInstance(){
        if(instance == null)
            instance = new SingletonExample();
        return instance;
    }

    public void doSomething(){
        System.out.println("doing something");
    }

}


