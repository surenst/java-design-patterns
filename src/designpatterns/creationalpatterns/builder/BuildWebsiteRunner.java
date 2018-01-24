package designpatterns.creationalpatterns.builder;

/**
 * <p>Separate the construction of a complex object from its representation,
 * allowing the same construction process to create various representations.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Builder_pattern" rel="noreferrer">Builder</a> <sup><sub>(recognizeable by creational methods returning the instance itself)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-boolean-" rel="noreferrer"><code>java.lang.StringBuilder#append()</code></a> (unsynchronized)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-" rel="noreferrer"><code>java.lang.StringBuffer#append()</code></a> (synchronized)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-" rel="noreferrer"><code>java.nio.ByteBuffer#put()</code></a> (also on <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/CharBuffer.html#put-char-" rel="noreferrer"><code>CharBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/ShortBuffer.html#put-short-" rel="noreferrer"><code>ShortBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/IntBuffer.html#put-int-" rel="noreferrer"><code>IntBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/LongBuffer.html#put-long-" rel="noreferrer"><code>LongBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/FloatBuffer.html#put-float-" rel="noreferrer"><code>FloatBuffer</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/DoubleBuffer.html#put-double-" rel="noreferrer"><code>DoubleBuffer</code></a>)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.Group.html#addComponent-java.awt.Component-" rel="noreferrer"><code>javax.swing.GroupLayout.Group#addComponent()</code></a></li>
 * <li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html" rel="noreferrer"><code>java.lang.Appendable</code></a></li>
 * </ul>
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        System.out.println(director.getWebsite());

        director.setBuilder(new EnterpriseWebsiteBuilder());
        System.out.println(director.getWebsite());

    }
}
