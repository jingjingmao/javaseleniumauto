package run;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class TestRun {
    public static void main(String[] args){

        TestNG testng = new TestNG();

        List suites = Lists.newArrayList();

        suites.add("/testng.xml");//path to xml..
        testng.setTestSuites(suites);

        testng.run();

    }
}
