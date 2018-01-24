package designpatterns.behavioralpatterns.interpreter;

/**
 * <p>Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Interpreter_pattern" rel="noreferrer">Interpreter</a> <sup><sub>(recognizeable by behavioral methods returning a <em>structurally</em> different instance/type of the given instance/type; note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html" rel="noreferrer"><code>java.util.Pattern</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html" rel="noreferrer"><code>java.text.Normalizer</code></a></li>
 * <li>All subclasses of <a href="http://docs.oracle.com/javase/8/docs/api/java/text/Format.html" rel="noreferrer"><code>java.text.Format</code></a></li>
 * <li>All subclasses of <a href="http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html" rel="noreferrer"><code>javax.el.ELResolver</code></a></li>
 * </ul>
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does Java developer knows Java Core :" + isJava.interpret("java"));
        System.out.println("Does Java developer knows Java EE :" + isJavaEE.interpret("java spring"));
    }

    private static Expression getJavaEEExpression() {
        Expression expression1 = new TerminalExpression("java");
        Expression expression2 = new TerminalExpression("Spring");
        return new AndExpression(expression1, expression2);

    }

    private static Expression getJavaExpression() {
        Expression expression1 = new TerminalExpression("java");
        Expression expression2 = new TerminalExpression("java core");
        return new OrExpression(expression1, expression2);
    }
}
