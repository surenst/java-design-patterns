package designpatterns.structuralpatterns.facade;

/**
 * <p>Provide a unified interface to a set of interfaces in a subsystem. <br/>
 * Facade defines a higher-level interface that makes the subsystem easier to use.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Facade_pattern" rel="noreferrer">Facade</a> <sup><sub>(recognizeable by behavioral methods which internally uses instances of <em>different</em> independent abstract/interface types)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/context/FacesContext.html" rel="noreferrer"><code>javax.faces.context.FacesContext</code></a>, it internally uses among others the abstract/interface types <a href="http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html" rel="noreferrer"><code>LifeCycle</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/faces/application/ViewHandler.html" rel="noreferrer"><code>ViewHandler</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/faces/application/NavigationHandler.html" rel="noreferrer"><code>NavigationHandler</code></a> and many more without that the enduser has to worry about it (which are however overrideable by injection).</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/context/ExternalContext.html" rel="noreferrer"><code>javax.faces.context.ExternalContext</code></a>, which internally uses <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/ServletContext.html" rel="noreferrer"><code>ServletContext</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSession.html" rel="noreferrer"><code>HttpSession</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequest.html" rel="noreferrer"><code>HttpServletRequest</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletResponse.html" rel="noreferrer"><code>HttpServletResponse</code></a>, etc.</li>
 * </ul>
 */
public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.startWork();
    }
}
