package designpatterns.behavioralpatterns.memento;

import java.time.LocalDateTime;

public class Save {
    private final String version;
    private final LocalDateTime localDateTime;

    public Save(String version) {
        this.version = version;
        this.localDateTime = LocalDateTime.now();
    }

    public String getVersion() {return version;}
    public LocalDateTime getLocalDateTime() {return localDateTime;}

}
