package designpatterns.behavioralpatterns.chainofresponsibility;

public class SimpleNotifier extends Notifier {
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Notifying from SimpleNotifier: " + message);
    }
}
