package designpatterns.creationalpatterns.singleton;

/**
 * <p>
 *     With this way, we force every thread to wait its turn before it can enter the method.
 *     So, no two threads will enter the method at the same time.
 *     The synchronized comes with a price, it will decrease the performance,
 *     but if the call to the getInstance() method isn’t causing a substantial overhead for your application,
 *     forget about it
 *     </p>
 */
public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded sc = null;
    private SingletonLazyMultithreaded(){}
    public static synchronized SingletonLazyMultithreaded getInstance(){
        if(sc==null){
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
