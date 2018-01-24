package designpatterns.structuralpatterns.bridge;

/**
 * <p>Decouple an abstraction from its implementation allowing the two to vary independently.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Bridge_pattern" rel="noreferrer">Bridge</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>different</em> abstract/interface type and returning an implementation of own abstract/interface type which <em>delegates/uses</em> the given instance)</sub></sup></h3>
 * <ul>
 <li>None comes to mind yet. A fictive example would be <code>new LinkedHashMap(LinkedHashSet&lt;K&gt;, List&lt;V&gt;)</code> which returns an unmodifiable linked map which doesn't clone the items, but <em>uses</em> them. The <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#newSetFromMap-java.util.Map-" rel="noreferrer"><code>java.util.Collections#newSetFromMap()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#singleton-T-" rel="noreferrer"><code>singletonXXX()</code></a> methods however comes close.</li>
 </ul>
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper()), new StockExchange(new CppDeveloper())};

        for(Program program:programs){
            program.developProgram();
        }
    }
}
