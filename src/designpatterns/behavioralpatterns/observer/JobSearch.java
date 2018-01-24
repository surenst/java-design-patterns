package designpatterns.behavioralpatterns.observer;

/**
 * <p>Define a one-to-many dependency between objects where a state change in one object results in all its dependents being notified and updated automatically.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Observer_pattern" rel="noreferrer">Observer (or Publish/Subscribe)</a> <sup><sub>(recognizeable by behavioral methods which invokes a method on an instance of <em>another</em> abstract/interface type, depending on own state)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html" rel="noreferrer"><code>java.util.Observer</code></a>/<a href="http://docs.oracle.com/javase/8/docs/api/java/util/Observable.html" rel="noreferrer"><code>java.util.Observable</code></a> (rarely used in real world though)</li>
 * <li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html" rel="noreferrer"><code>java.util.EventListener</code></a> (practically all over Swing thus)</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html" rel="noreferrer"><code>javax.servlet.http.HttpSessionBindingListener</code></a></li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionAttributeListener.html" rel="noreferrer"><code>javax.servlet.http.HttpSessionAttributeListener</code></a></li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/event/PhaseListener.html" rel="noreferrer"><code>javax.faces.event.PhaseListener</code></a></li>
 * </ul>
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperWebsite jobsite = new JavaDeveloperWebsite();

        jobsite.addVacancies("Java Developer");
        jobsite.addVacancies("Senior Java Developer");

        Observer observer = new Subscriber("John Smith");
        Observer observer1 = new Subscriber("Smith John");

        jobsite.addObserver(observer);
        jobsite.addObserver(observer1);

        jobsite.addVacancies("Full Stack Java Developer");

        jobsite.removeVacancies("Java Developer");

        jobsite.removeObserver(observer1);

    }
}
