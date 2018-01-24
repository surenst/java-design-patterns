package designpatterns.behavioralpatterns.command;

public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void executeCommand() {
        database.insert();
    }
}
