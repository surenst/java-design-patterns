package designpatterns.behavioralpatterns.template;

public class NewsPage extends WebsitePage {
    @Override
    public void showContent() {
        System.out.println("News");
    }
}
