package designpatterns.creationalpatterns.abstractfactory.banking;

import designpatterns.creationalpatterns.abstractfactory.Developer;
import designpatterns.creationalpatterns.abstractfactory.ProjectManager;
import designpatterns.creationalpatterns.abstractfactory.ProjectTeamFactory;
import designpatterns.creationalpatterns.abstractfactory.Tester;

public class BankingProjectFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectmanager() {
        return new BankingPM();
    }
}
