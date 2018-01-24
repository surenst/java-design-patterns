package designpatterns.behavioralpatterns.chainofresponsibility;

/**
 * <p>Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.<br/>
 * Chain the receiving objects and pass the request along the chain until an object handles it.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Chain_of_responsibility_pattern" rel="noreferrer">Chain of responsibility</a> <sup><sub>(recognizeable by behavioral methods which (indirectly) invokes the same method in <em>another</em> implementation of <em>same</em> abstract/interface type in a queue)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log-java.util.logging.Level-java.lang.String-" rel="noreferrer"><code>java.util.logging.Logger#log()</code></a></li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-" rel="noreferrer"><code>javax.servlet.Filter#doFilter()</code></a></li>
 * </ul>
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifyManager("Nothing special...", Priority.ROUTINE);
        simpleNotifier.notifyManager("Oops, something goes wrong", Priority.IMPORTANT);
        simpleNotifier.notifyManager("Houston, we have a problem", Priority.ASAP);

    }
}
