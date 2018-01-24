package designpatterns.creationalpatterns.singleton;

/**
 * <h3><a href="http://en.wikipedia.org/wiki/Singleton_pattern" rel="noreferrer">Singleton</a> <sup><sub>(recognizeable by creational methods returning the <em>same</em> instance (usually of itself) everytime)</sub></sup></h3>
 * <ul>
 <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime--" rel="noreferrer"><code>java.lang.Runtime#getRuntime()</code></a></li>
 <li><a href="http://docs.oracle.com/javase/8/docs/api/java/awt/Desktop.html#getDesktop--" rel="noreferrer"><code>java.awt.Desktop#getDesktop()</code></a></li>
 <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--" rel="noreferrer"><code>java.lang.System#getSecurityManager()</code></a></li>
 </ul>
 */
public class SingletonRunner {
    public static void main(String[] args) {
        Singleton.getInstance();
        SingletonEager.getInstance();
        SingletoneEnum.SingleEnum.values();
        SingletonLazy.getInstance();
        SingletonLazyDoubleCheck.getInstance();
        SingletonLazyMultithreaded.getInstance();
    }
}
