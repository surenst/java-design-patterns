package designpatterns.structuralpatterns.adapter;

/**
 * <p>
 * Convert the interface of a class into another interface clients expect. <br/>
 * An adapter lets classes work together that could not otherwise because of incompatible interfaces. <br/>
 * The enterprise integration pattern equivalent is the translator.
 * </p>
 * <h3><a href="http://en.wikipedia.org/wiki/Adapter_pattern" rel="noreferrer">Adapter</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>different</em> abstract/interface type and returning an implementation of own/another abstract/interface type which <em>decorates/overrides</em> the given instance)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-" rel="noreferrer"><code>java.util.Arrays#asList()</code></a></li>
 * <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-" rel="noreferrer"><code>java.util.Collections#list()</code></a></li>
 * <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-" rel="noreferrer"><code>java.util.Collections#enumeration()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#InputStreamReader-java.io.InputStream-" rel="noreferrer"><code>java.io.InputStreamReader(InputStream)</code></a> (returns a <code>Reader</code>)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStreamWriter.html#OutputStreamWriter-java.io.OutputStream-" rel="noreferrer"><code>java.io.OutputStreamWriter(OutputStream)</code></a> (returns a <code>Writer</code>)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-" rel="noreferrer"><code>javax.xml.bind.annotation.adapters.XmlAdapter#marshal()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#unmarshal-ValueType-" rel="noreferrer"><code>#unmarshal()</code></a></li>
 * </ul>
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaDatabase();

        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
