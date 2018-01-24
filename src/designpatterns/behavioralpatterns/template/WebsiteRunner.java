package designpatterns.behavioralpatterns.template;

/**
 * <p>Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. <br/>
 * Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Template_method_pattern" rel="noreferrer">Template method</a> <sup><sub>(recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type)</sub></sup></h3>
 * <ul>
 * <li>All non-abstract methods of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html" rel="noreferrer"><code>java.io.InputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html" rel="noreferrer"><code>java.io.OutputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html" rel="noreferrer"><code>java.io.Reader</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html" rel="noreferrer"><code>java.io.Writer</code></a>.</li>
 * <li>All non-abstract methods of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html" rel="noreferrer"><code>java.util.AbstractList</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html" rel="noreferrer"><code>java.util.AbstractSet</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html" rel="noreferrer"><code>java.util.AbstractMap</code></a>.</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html" rel="noreferrer"><code>javax.servlet.http.HttpServlet</code></a>, all the <code>doXXX()</code> methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.</li>
 * </ul>
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsitePage welcome = new WelcomePage();
        WebsitePage news = new NewsPage();

        welcome.showPage();
        news.showPage();
    }
}
