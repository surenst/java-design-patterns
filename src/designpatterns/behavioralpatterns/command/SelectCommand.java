package designpatterns.behavioralpatterns.command;

public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void executeCommand() {
        database.select();
    }
}
