package designpatterns.structuralpatterns.facade;

public class Workflow {
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();

    public void startWork(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }

}
