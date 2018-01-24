package designpatterns.behavioralpatterns.mediator;

/**
 * <p>Define an object that encapsulates how a set of objects interact.<br/>
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly, <br/>
 * and it allows their interaction to vary independently.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Mediator_pattern" rel="noreferrer">Mediator</a> <sup><sub>(recognizeable by behavioral methods taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html" rel="noreferrer"><code>java.util.Timer</code></a> (all <code>scheduleXXX()</code> methods)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-" rel="noreferrer"><code>java.util.concurrent.Executor#execute()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html" rel="noreferrer"><code>java.util.concurrent.ExecutorService</code></a> (the <code>invokeXXX()</code> and <code>submit()</code> methods)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html" rel="noreferrer"><code>java.util.concurrent.ScheduledExecutorService</code></a> (all <code>scheduleXXX()</code> methods)</li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-" rel="noreferrer"><code>java.lang.reflect.Method#invoke()</code></a></li>
 * </ul>
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        user1.sendMessage("Hi everyone");

        admin.sendMessage("Admin is online!");
    }
}
