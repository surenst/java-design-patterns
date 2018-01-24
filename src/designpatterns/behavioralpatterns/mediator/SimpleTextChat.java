package designpatterns.behavioralpatterns.mediator;

import java.util.HashSet;
import java.util.Set;

public class SimpleTextChat implements Chat {
    private User admin;
    private Set<User> users = new HashSet<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u:users){
            if(u!=user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
