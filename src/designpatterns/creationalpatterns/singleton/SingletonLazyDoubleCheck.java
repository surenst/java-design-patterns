package designpatterns.creationalpatterns.singleton;

/**
 * <p>
 *     With the double-checked locking, we first check to see if an instance is created, and if not, then we synchronize.
 *     This way, we only synchronize the first time.
 * </p>
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if(sc==null){
            synchronized(SingletonLazyDoubleCheck.class){
                if(sc==null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
