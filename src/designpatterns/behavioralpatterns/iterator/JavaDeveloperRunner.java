package designpatterns.behavioralpatterns.iterator;

/**
 * <p>Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Interpreter_pattern" rel="noreferrer">Interpreter</a> <sup><sub>(recognizeable by behavioral methods returning a <em>structurally</em> different instance/type of the given instance/type; note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html" rel="noreferrer"><code>java.util.Pattern</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html" rel="noreferrer"><code>java.text.Normalizer</code></a></li>
 * <li>All subclasses of <a href="http://docs.oracle.com/javase/8/docs/api/java/text/Format.html" rel="noreferrer"><code>java.text.Format</code></a></li>
 * <li>All subclasses of <a href="http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html" rel="noreferrer"><code>javax.el.ELResolver</code></a></li>
 * </ul>
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {

        JavaDeveloper javaDeveloper = new JavaDeveloper("John Smith", new String[]{"Java", "Spring", "MySQL", "Microservices"});

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
