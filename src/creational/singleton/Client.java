package creational.singleton;

public class Client {
    public static void main(String[] args) {
        SingletonExample singleton1 = SingletonExample.getInstance();
        singleton1.doSomething();

        SingletonExample singleton2 = SingletonExample.getInstance();
        singleton2.doSomething();

        System.out.println("--------------------");
        System.out.println("is same instance?");
        System.out.println(singleton1.equals(singleton2));

    }
}
