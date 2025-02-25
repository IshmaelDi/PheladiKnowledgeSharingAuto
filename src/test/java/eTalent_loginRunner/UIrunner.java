package eTalent_loginRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/eTalent_loginPage.feature", // Path to the .feature files
        glue = "eTalent_StepsDefinitions", // Step Definitions package
        plugin = {"pretty",
                "html:target/cucumber-html-report"}, // Plugins for reporting
        monochrome = false // Clean console output
)
public class UIrunner {
}
