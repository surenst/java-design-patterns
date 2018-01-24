package designpatterns.structuralpatterns.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeWeekReport(){
        return "Make week report. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeWeekReport();
    }
}
