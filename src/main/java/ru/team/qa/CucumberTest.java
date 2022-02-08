package ru.team.qa;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.*;
import java.util.Properties;

/**
 * 1. Install plugin "Cucumber for Java"
 * 2. Create a Java-class for all pages
 * 3. ...
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"resources/feature"},
        tags = {"@UI"},
        monochrome = true,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberTest {
    @BeforeClass
    public static void setup() {}

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        String propsPath = "G://autotestJ/src/main/resources/config/wix.properties";
        props.load(new FileReader(propsPath));
        System.setProperties(props);
        System.out.println(props.getProperty("webdriver.chrome.driver"));
        System.out.println(System.getProperty("webdriver.chrome.driver"));
    }

    @AfterClass
    public static void teardown() {}
}
