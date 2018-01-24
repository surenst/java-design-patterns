package designpatterns.structuralpatterns.composite;

/**
 * <p>Compose objects into tree structures to represent part-whole hierarchies. <br/>
 * Composite lets clients treat individual objects and compositions of objects uniformly.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Composite_pattern" rel="noreferrer">Composite</a> <sup><sub>(recognizeable by behavioral methods taking an instance of <em>same</em> abstract/interface type into a tree structure)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-" rel="noreferrer"><code>java.awt.Container#add(Component)</code></a> (practically all over Swing thus)</li>
 * <li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/UIComponent.html#getChildren--" rel="noreferrer"><code>javax.faces.component.UIComponent#getChildren()</code></a> (practically all over JSF UI thus)</li>
 * </ul>
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.startProject();
    }
}
