package ru.team.qa;


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

    public static void main(String[] args) {}

    @AfterClass
    public static void teardown() {}
}
