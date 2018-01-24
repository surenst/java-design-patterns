package designpatterns.creationalpatterns.abstractfactory.banking;

import designpatterns.creationalpatterns.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking project manager manages banking project...");
    }
}
