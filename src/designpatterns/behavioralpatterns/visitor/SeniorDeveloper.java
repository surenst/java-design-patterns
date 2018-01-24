package designpatterns.behavioralpatterns.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass project) {
        System.out.println("Re-righting project class... ");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Re-righting tests ...");
    }
}
