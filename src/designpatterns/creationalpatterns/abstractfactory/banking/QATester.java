package designpatterns.creationalpatterns.abstractfactory.banking;

import designpatterns.creationalpatterns.abstractfactory.Tester;

public class QATester implements Tester{
    @Override
    public void testCode() {
        System.out.println("QA tester testing code...");
    }
}
