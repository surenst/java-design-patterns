package designpatterns.creationalpatterns.abstractfactory;

import designpatterns.creationalpatterns.abstractfactory.banking.BankingProjectFactory;
import designpatterns.creationalpatterns.abstractfactory.website.WebsiteProjectFactory;

/**
 * <p>Provide an interface for creating families of related or dependent objects without specifying their concrete classes.</p>
 * <h3><a href="http://en.wikipedia.org/wiki/Abstract_factory_pattern" rel="noreferrer">Abstract factory</a> <sup><sub>(recognizeable by creational methods returning the factory itself which in turn can be used to create another abstract/interface type)</sub></sup></h3>
 * <ul>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance--" rel="noreferrer"><code>javax.xml.parsers.DocumentBuilderFactory#newInstance()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--" rel="noreferrer"><code>javax.xml.transform.TransformerFactory#newInstance()</code></a></li>
 * <li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--" rel="noreferrer"><code>javax.xml.xpath.XPathFactory#newInstance()</code></a></li>
 * </ul>
 */
public class AbstractFactoryMainClass {
    public static void main(String[] args) {
        ProjectTeamFactory bankProjectTeamFactory = new BankingProjectFactory();
        Developer bankDeveloper = bankProjectTeamFactory.getDeveloper();
        Tester bankTester = bankProjectTeamFactory.getTester();
        ProjectManager bankPM = bankProjectTeamFactory.getProjectmanager();

        System.out.println("starting Bank project");
        bankDeveloper.writeCode();
        bankTester.testCode();
        bankPM.manageProject();

        System.out.println("-------------------------------------------------");

        ProjectTeamFactory websiteProjectTeamFactory = new WebsiteProjectFactory();
        Developer websiteDeveloper = websiteProjectTeamFactory.getDeveloper();
        Tester websiteTester = websiteProjectTeamFactory.getTester();
        ProjectManager websitePM = websiteProjectTeamFactory.getProjectmanager();

        System.out.println("starting Webiste project");

        websiteDeveloper.writeCode();
        websiteTester.testCode();
        websitePM.manageProject();

    }
}
