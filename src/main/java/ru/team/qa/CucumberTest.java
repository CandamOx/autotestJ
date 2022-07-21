package ru.team.qa;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import java.io.*;
import java.util.Properties;

/**
 * 1. Install plugin "Cucumber for Java"
 * 2. Create a Java-class for all pages
 * 3. ...
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ru.team.qa.pages"},
        features = {".\\src\\main\\resources\\feature"},
        tags = {"@UI"},
        monochrome = true,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberTest {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        String propsPath = "./src/main/resources/config/wix.properties";
        props.load(new FileReader(propsPath));
        System.setProperties(props);

        List<String> argv = new ArrayList(Arrays.asList(
                "--glue", "ru.team.qa"
        ));
        String tags = "@UI";
        argv.add("--tags");
        argv.add(tags);

        String feature = "src/main/resources/feature";
        argv.add(feature);

        try {
            cucumber.api.cli.Main.main(argv.toArray(new String[]{}));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    @BeforeClass
//    public static void setup() {}
//
//    public static void main(String[] args) throws IOException {
//        Properties props = new Properties();
//        String propsPath = "G://autotestJ/src/main/resources/config/wix.properties";
//        props.load(new FileReader(propsPath));
//        System.setProperties(props);
//
//        String tags = System.getProperty("TAGS");
//        if (empty(tags)) {
//            tags = "@UI";
//            System.setProperty("TAGS", tags);
//        }
//        String prop = System.getProperty("cucumber.options");
//        if (empty(prop)) {
//            prop = String.format("--tags %s --plugin pretty", tags);
//            System.setProperty("cucumber.options", prop);
//        }
//        String actProp = System.getProperty("activeProperties");
//        if (empty(actProp)) {
//            actProp = "G://autotestJ/src/main/resources/config/wix.properties";
//            System.setProperty("activeProperties", actProp);
//        }
//    }
//
//    @AfterClass
//    public static void teardown() {}
//
//    private static boolean empty(String prop) {
//        return prop == null || prop.length() == 0;
//    }

}
