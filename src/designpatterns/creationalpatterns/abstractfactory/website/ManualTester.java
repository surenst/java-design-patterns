package designpatterns.creationalpatterns.abstractfactory.website;

import designpatterns.creationalpatterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
