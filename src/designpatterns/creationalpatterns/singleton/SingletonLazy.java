package designpatterns.creationalpatterns.singleton;

/**
 * <p>Lazy initialization method to implement Singleton pattern creates the instance in the global access method</p>
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
