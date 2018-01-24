package designpatterns.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperWebsite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subScribers = new ArrayList<>();

    public void addVacancies(String vacancy){
        vacancies.add(vacancy);
        notifiyObservers();
    }

    public void removeVacancies(String vacancy){
        vacancies.remove(vacancy);
        notifiyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subScribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subScribers.remove(observer);
    }

    @Override
    public void notifiyObservers() {
        for(Observer observer:subScribers){
            observer.handleEvent(vacancies);
        }
    }
}
