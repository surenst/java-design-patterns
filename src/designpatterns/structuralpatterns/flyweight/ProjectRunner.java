package designpatterns.structuralpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Use sharing to support large numbers of similar objects efficiently.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Flyweight_pattern" rel="noreferrer">Flyweight</a> <sup><sub>(recognizeable by creational methods returning a cached instance, a bit the "multiton" idea)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf-int-" rel="noreferrer"><code>java.lang.Integer#valueOf(int)</code></a> (also on <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html#valueOf-boolean-" rel="noreferrer"><code>Boolean</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html#valueOf-byte-" rel="noreferrer"><code>Byte</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#valueOf-char-" rel="noreferrer"><code>Character</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Short.html#valueOf-short-" rel="noreferrer"><code>Short</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Long.html#valueOf-long-" rel="noreferrer"><code>Long</code></a> and <a href="https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html#valueOf-long-int-" rel="noreferrer"><code>BigDecimal</code></a>)</li>
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("c++"));
        for (Developer developer : developerList) {
            developer.writeCode();
        }
    }
}
