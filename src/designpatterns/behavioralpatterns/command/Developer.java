package designpatterns.behavioralpatterns.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertCommand(){
        insert.executeCommand();
    }
    public void updateCommand(){
        update.executeCommand();
    }
    public void selectCommand(){
        select.executeCommand();
    }
    public void deleteCommand(){
        delete.executeCommand();
    }

}
