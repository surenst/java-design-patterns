package designpatterns.behavioralpatterns.mediator;

public class Admin implements User {
    private Chat chat;
    private String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.getName() + " receive message : " + message);
    }
}
