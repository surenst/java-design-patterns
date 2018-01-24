package designpatterns.behavioralpatterns.chainofresponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level){
        if(level >= priority){
            write(message);
        }
        if(null!= nextNotifier){
            nextNotifier.notifyManager(message, level);
        }
    }

    protected abstract void write(String message);
}
