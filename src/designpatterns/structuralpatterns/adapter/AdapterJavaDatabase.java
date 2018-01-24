package designpatterns.structuralpatterns.adapter;

public class AdapterJavaDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        createObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        readobject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
