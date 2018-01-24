package designpatterns.behavioralpatterns.observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifiyObservers();
}
