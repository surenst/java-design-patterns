package designpatterns.creationalpatterns.factorymethod;

/**
 * <p>Define an interface for creating a single object, but let subclasses decide which class to instantiate.<br/>
 * Factory Method lets a class defer instantiation to subclasses.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Factory_method_pattern" rel="noreferrer">Factory method</a> <sup><sub>(recognizeable by creational methods returning an implementation of an abstract/interface type)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--" rel="noreferrer"><code>java.util.Calendar#getInstance()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html#getBundle-java.lang.String-" rel="noreferrer"><code>java.util.ResourceBundle#getBundle()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getInstance--" rel="noreferrer"><code>java.text.NumberFormat#getInstance()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html#forName-java.lang.String-" rel="noreferrer"><code>java.nio.charset.Charset#forName()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/net/URLStreamHandlerFactory.html" rel="noreferrer"><code>java.net.URLStreamHandlerFactory#createURLStreamHandler(String)</code></a> (Returns singleton object per protocol)</li>
 * <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/EnumSet.html#of(E)" rel="noreferrer"><code>java.util.EnumSet#of()</code></a></li>
 * <li><a href="https://docs.oracle.com/javase/8/docs/api/javax/xml/bind/JAXBContext.html#createMarshaller--" rel="noreferrer"><code>javax.xml.bind.JAXBContext#createMarshaller()</code></a> and other similar methods</li>
 * </ul>
 */
public class FactoryMethodMainClass {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

    }

    private static DeveloperFactory createDeveloperFactory(String dev) {
        if (dev.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (dev.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(dev + " developer is not accessible");
        }
    }
}
