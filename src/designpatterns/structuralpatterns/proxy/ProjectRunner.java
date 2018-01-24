package designpatterns.structuralpatterns.proxy;

/**
 * <p>Provide a surrogate or placeholder for another object to control access to it.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Proxy_pattern" rel="noreferrer">Proxy</a> <sup><sub>(recognizeable by creational methods which returns an implementation of given abstract/interface type which in turn <em>delegates/uses</em> a <em>different</em> implementation of given abstract/interface type)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html" rel="noreferrer"><code>java.lang.reflect.Proxy</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/rmi/package-summary.html" rel="noreferrer"><code>java.rmi.*</code></a></li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/ejb/EJB.html" rel="noreferrer"><code>javax.ejb.EJB</code></a> (<a href="https://stackoverflow.com/questions/25514361/when-using-ejb-does-each-managed-bean-get-its-own-ejb-instance">explanation here</a>)</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/inject/Inject.html" rel="noreferrer"><code>javax.inject.Inject</code></a> (<a href="https://stackoverflow.com/questions/29651008/field-getobj-returns-all-nulls-on-injected-cdi-managed-beans-while-manually-i/29672591#29672591">explanation here</a>)</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/persistence/PersistenceContext.html" rel="noreferrer"><code>javax.persistence.PersistenceContext</code></a></li>
 * </ul>
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/someuser/someproject");

        project.run();
    }
}
