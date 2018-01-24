package designpatterns.behavioralpatterns.memento;

/**
 * <p>
 * Without violating encapsulation, capture and externalize an object's internal state allowing the object to be restored to this state later.
 * </p>
 * <h3><a href="http://en.wikipedia.org/wiki/Memento_pattern" rel="noreferrer">Memento</a> <sup><sub>(recognizeable by behavioral methods which internally changes the state of the <em>whole</em> instance)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Date.html" rel="noreferrer"><code>java.util.Date</code></a> (the setter methods do that, <code>Date</code> is internally represented by a <code>long</code> value)</li>
 * <li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html" rel="noreferrer"><code>java.io.Serializable</code></a></li>
 * <li>All implementations of <a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/StateHolder.html" rel="noreferrer"><code>javax.faces.component.StateHolder</code></a></li>
 * </ul>
 */
public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project with version 1.0");
        project.setVersion("Version 1.0");

        System.out.println(project);

        System.out.println("Push project into github repo");
        githubRepo.setSave(project.save());

        System.out.println("Updating version to 1.1");
        project.setVersion("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rollback...");

        project.load(githubRepo.getSave());

        System.out.println("ProjectClass rollback to previews version");
        System.out.println(project);
    }
}
