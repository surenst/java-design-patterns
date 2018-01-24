package designpatterns.behavioralpatterns.visitor;

/**
 * <p>Represent an operation to be performed on the elements of an object structure. Visitor lets a new operation be defined without changing the classes of the elements on which it operates.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Visitor_pattern" rel="noreferrer">Visitor</a> <sup><sub>(recognizeable by two <em>different</em> abstract/interface types which has methods definied which takes each the <em>other</em> abstract/interface type; the one actually calls the method of the other and the other executes the desired strategy on it)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValue.html" rel="noreferrer"><code>javax.lang.model.element.AnnotationValue</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValueVisitor.html" rel="noreferrer"><code>AnnotationValueVisitor</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html" rel="noreferrer"><code>javax.lang.model.element.Element</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/ElementVisitor.html" rel="noreferrer"><code>ElementVisitor</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/type/TypeMirror.html" rel="noreferrer"><code>javax.lang.model.type.TypeMirror</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/type/TypeVisitor.html" rel="noreferrer"><code>TypeVisitor</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/file/FileVisitor.html" rel="noreferrer"><code>java.nio.file.FileVisitor</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/file/SimpleFileVisitor.html" rel="noreferrer"><code>SimpleFileVisitor</code></a></li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/visit/VisitContext.html" rel="noreferrer"><code>javax.faces.component.visit.VisitContext</code></a> and <a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/visit/VisitCallback.html" rel="noreferrer"><code>VisitCallback</code></a></li>
 * </ul>
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(juniorDeveloper);

        System.out.println("Senior in action");
        project.beWritten(seniorDeveloper);
    }
}
