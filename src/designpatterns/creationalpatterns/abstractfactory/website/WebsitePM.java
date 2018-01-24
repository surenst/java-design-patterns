package designpatterns.creationalpatterns.abstractfactory.website;

import designpatterns.creationalpatterns.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
