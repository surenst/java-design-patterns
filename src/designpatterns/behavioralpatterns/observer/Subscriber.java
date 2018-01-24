package designpatterns.behavioralpatterns.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name +"\n we have some changes in vacancies: \n" + vacancies
                + "\n=================================================================\n");

    }
}
