package designpatterns.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void startProject(){
        System.out.println("Starting project\n");
        for(Developer developer:developers){
            developer.writeCode();
        }
    }

}
