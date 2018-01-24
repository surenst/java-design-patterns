package designpatterns.structuralpatterns.decorator;

/**
 * <p>Attach additional responsibilities to an object dynamically keeping the same interface. <br/>
 * Decorators provide a flexible alternative to subclassing for extending functionality.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Decorator_pattern" rel="noreferrer">Decorator</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>same</em> abstract/interface type which adds additional behaviour)</sub></sup></h3>
 * <ul>
 * <li>All subclasses of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html" rel="noreferrer"><code>java.io.InputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html" rel="noreferrer"><code>OutputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html" rel="noreferrer"><code>Reader</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html" rel="noreferrer"><code>Writer</code></a> have a constructor taking an instance of same type.</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html" rel="noreferrer"><code>java.util.Collections</code></a>, the <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#checkedCollection-java.util.Collection-java.lang.Class-" rel="noreferrer"><code>checkedXXX()</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedCollection-java.util.Collection-" rel="noreferrer"><code>synchronizedXXX()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#unmodifiableCollection-java.util.Collection-" rel="noreferrer"><code>unmodifiableXXX()</code></a> methods.</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequestWrapper.html" rel="noreferrer"><code>javax.servlet.http.HttpServletRequestWrapper</code></a> and <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletResponseWrapper.html" rel="noreferrer"><code>HttpServletResponseWrapper</code></a></li>
 * </ul>
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new JavaSeniorDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
