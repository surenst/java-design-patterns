package designpatterns.creationalpatterns.builder;

public class Director {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }


    Website getWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }
}
