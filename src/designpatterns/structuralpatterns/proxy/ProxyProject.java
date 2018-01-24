package designpatterns.structuralpatterns.proxy;

public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(null == realProject){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
