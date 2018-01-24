package designpatterns.creationalpatterns.abstractfactory.website;

import designpatterns.creationalpatterns.abstractfactory.Developer;
import designpatterns.creationalpatterns.abstractfactory.ProjectManager;
import designpatterns.creationalpatterns.abstractfactory.ProjectTeamFactory;
import designpatterns.creationalpatterns.abstractfactory.Tester;

public class WebsiteProjectFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectmanager() {
        return new WebsitePM();
    }
}
