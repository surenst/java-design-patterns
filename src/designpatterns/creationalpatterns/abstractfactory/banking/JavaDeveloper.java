package designpatterns.creationalpatterns.abstractfactory.banking;

import designpatterns.creationalpatterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
