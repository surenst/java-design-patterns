package designpatterns.behavioralpatterns.command;

/**
 * <p>Encapsulate a request as an object, thereby allowing for the parameterization of clients with different requests, <br/>
 * and the queuing or logging of requests. It also allows for the support of undoable operations.</p>
 * <p>
 * <h3><a href="http://en.wikipedia.org/wiki/Command_pattern" rel="noreferrer">Command</a> <sup><sub>(recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a <em>different</em> abstract/interface type which has been <em>encapsulated</em> by the command implementation during its creation)</sub></sup></h3>
 * <ul>
 * <li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html" rel="noreferrer"><code>java.lang.Runnable</code></a></li>
 * <li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html" rel="noreferrer"><code>javax.swing.Action</code></a></li>
 * </ul>
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(new InsertCommand(database), new UpdateCommand(database), new SelectCommand(database), new DeleteCommand(database));

        developer.insertCommand();
        developer.updateCommand();
        developer.selectCommand();
        developer.deleteCommand();
    }
}
