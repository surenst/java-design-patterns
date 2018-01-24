package designpatterns.behavioralpatterns.template;

public abstract class WebsitePage {

    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();

}
