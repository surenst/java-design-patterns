package designpatterns.structuralpatterns.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer solving problem...");
        }else{
            System.out.println("Hello stackoverflow");
        }
    }
}
