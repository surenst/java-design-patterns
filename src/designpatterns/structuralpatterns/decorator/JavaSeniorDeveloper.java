package designpatterns.structuralpatterns.decorator;

public class JavaSeniorDeveloper extends DeveloperDecorator {
    public JavaSeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
