package designpatterns.behavioralpatterns.strategy;

/**
 * <p>Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Strategy_pattern" rel="noreferrer">Strategy</a> <sup><sub>(recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a <em>different</em> abstract/interface type which has been <em>passed-in</em> as method argument into the strategy implementation)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#compare-T-T-" rel="noreferrer"><code>java.util.Comparator#compare()</code></a>, executed by among others <code>Collections#sort()</code>.</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html" rel="noreferrer"><code>javax.servlet.http.HttpServlet</code></a>, the <code>service()</code> and all <code>doXXX()</code> methods take <code>HttpServletRequest</code> and <code>HttpServletResponse</code> and the implementor has to process them (and not to get hold of them as instance variables!).</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-" rel="noreferrer"><code>javax.servlet.Filter#doFilter()</code></a></li>
 * </ul>
 */

public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();


    }
}
