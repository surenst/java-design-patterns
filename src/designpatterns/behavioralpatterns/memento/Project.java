package designpatterns.behavioralpatterns.memento;

import java.time.LocalDateTime;

public class Project {
    private String version;
    private LocalDateTime localDateTime;

    public void setVersion(String version) {
        this.version = version;
        this.localDateTime = LocalDateTime.now();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        this.version = save.getVersion();
        this.localDateTime = save.getLocalDateTime();
    }

    @Override
    public String toString() {
        return "ProjectClass \n" +
                "Version=" + version +
                "\nLocalDateTime=" + localDateTime;
    }
}
