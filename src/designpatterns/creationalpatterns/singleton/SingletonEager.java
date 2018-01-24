package designpatterns.creationalpatterns.singleton;

/**
 * <p>
 *     This is our singleton class which makes sure that only one object of the class gets created and even if there are several requests,
 *     only the same instantiated object will be returned.
 * </p>
 *     <br/>
 * <p>
 *     The one problem with this approach is that, the object would get created as soon as the class gets loaded into the JVM. If the
 *     object is never requested, there would be an object useless inside the memory.
 * </p>
 */
public class SingletonEager {
    private static SingletonEager sc = new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        return sc;
    }
}
