package designpatterns.behavioralpatterns.state;

/**
 * <p>Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/State_pattern" rel="noreferrer">State</a> <sup><sub>(recognizeable by behavioral methods which changes its behaviour depending on the instance's state which can be controlled externally)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html#execute-javax.faces.context.FacesContext-" rel="noreferrer"><code>javax.faces.lifecycle.LifeCycle#execute()</code></a> (controlled by <a href="http://docs.oracle.com/javaee/7/api/javax/faces/webapp/FacesServlet.html" rel="noreferrer"><code>FacesServlet</code></a>, the behaviour is dependent on current phase (state) of JSF lifecycle)</li>
 * </ul>
 */

public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Activity activity = new Sleeping();
        developer.setActivity(activity);

        for (int i = 0; i < 8; i++) {
            developer.jastDoIt();
            developer.changeActivity();
        }

    }
}
