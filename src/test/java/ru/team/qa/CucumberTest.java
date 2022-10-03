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

import static java.lang.String.format;
import static ru.team.qa.utils.ConfigUtils.loadProperties;

/**
 * 1. Install plugin "Cucumber for Java"
 * 2. Create a Java-class for all pages
 * 3. ...
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ru.team.qa.stepdefs", "ru.sbtqa.tag.stepdefs.ru"},
        features = {".\\src\\main\\resources\\feature"},
        tags = {"@UI"},
        monochrome = true,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberTest {

    public static void setup() {
        System.out.println("\t= = = TESTS STARTED = = =");
        loadProperties();
    }

    public static void teardown() {
        System.out.println("\t= = = TESTS FINISHED = = =");
    }

    public static void main(String[] args) throws IOException {
        String tags = System.getProperty("TAGS");
        if (tags == null) {
            tags = "@UI"; // для локального запуска из Idea указываем тэг здесь
            System.setProperty("TAGS", tags);
        }

        String prop = System.getProperty("cucumber.options");
        if (empty(prop))
            System.setProperty("cucumber.options",
                    format("--tags %s --plugin pretty", tags));
        // + "--plugin ru.sbtqa.tag.pagefactory.support.TagPFAllureReporter"
        // это не важно, но пусть будет пока здесь

        prop = System.getProperty("activeProperties");
        if (empty(prop)) // тоже для локального запуска через Idea
            System.setProperty("activeProperties", "src/main/resources/config/wix.properties");

        setup();

        List<String> argv = new ArrayList(Arrays.asList(
                "--glue", "ru.team.qa.pages",
                "--glue", "ru.sbtqa.tag.stepdefs.ru" // sbt pagefactory - не оригинал библиотеки, это selenium, надо найти
        ));

        argv.add("--tags");
        argv.add(tags);

        String feature = "src/main/resources/feature";
        argv.add(feature);

        System.out.println(System.getProperties());

        cucumber.api.cli.Main.main(argv.toArray(new String[]{}));

    }

    private static boolean empty(String prop) {
        return prop == null || prop.length() == 0;
    }
}
