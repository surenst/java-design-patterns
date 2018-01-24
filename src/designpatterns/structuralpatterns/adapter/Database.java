package designpatterns.structuralpatterns.adapter;

public interface Database {
    void insert();
    void update();
    void select();
    void delete();
}
