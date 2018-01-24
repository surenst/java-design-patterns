package designpatterns.creationalpatterns.prototype;

/**
 * Specify the kinds of objects to create using a prototypical instance, <br/>and create new objects from the 'skeleton' of an existing object, <br/>thus boosting performance and keeping memory footprints to a minimum.
 * <h3><a href="http://en.wikipedia.org/wiki/Prototype_pattern" rel="noreferrer">Prototype</a> <sup><sub>(recognizeable by creational methods returning a <em>different</em> instance of itself with the same properties)</sub></sup></h3>
 * <ul>
 <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone--" rel="noreferrer"><code>java.lang.Object#clone()</code></a> (the class has to implement <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html" rel="noreferrer"><code>java.lang.Cloneable</code></a>)</li>
 </ul>
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "NewProject", "System.out.println(\"Hello World \")");

        System.out.println(project);

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project projectCopy = projectFactory.cloneProject();
        System.out.println("\n==============================\n");
        System.out.println(projectCopy);

    }
}
