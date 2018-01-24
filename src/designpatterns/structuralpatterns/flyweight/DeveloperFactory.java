package designpatterns.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String , Developer> developersMap = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developersMap.get(speciality);
        if(null == developer){
            switch (speciality){
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developersMap.put(speciality,developer);
        }
        return developer;
    }
}
