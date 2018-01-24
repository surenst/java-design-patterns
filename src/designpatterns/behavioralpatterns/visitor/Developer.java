package designpatterns.behavioralpatterns.visitor;

public interface Developer {
    void create(ProjectClass project);
    void create(Database database);
    void create(Test test);
}
