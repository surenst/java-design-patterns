package designpatterns.creationalpatterns.abstractfactory.website;

import designpatterns.creationalpatterns.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
