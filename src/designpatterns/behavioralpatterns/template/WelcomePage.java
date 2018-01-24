package designpatterns.behavioralpatterns.template;

public class WelcomePage extends WebsitePage {
    @Override
    public void showContent() {
        System.out.println("Welcome");
    }
}
