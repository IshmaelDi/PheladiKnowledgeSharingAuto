package eTalent_loginRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/eTalent_loginPage.feature", // Path to the .feature files

        // Step Definitions package
        glue = "eTalent_StepsDefinitions",
        monochrome = false,
        plugin = {

                // Readable output in console
                "pretty",

                // Generate HTML report
                "html:target/cucumber-html-report",

                // Generate JSON report for external integration
                "json:target/cucumber.json",

                // Generate JUnit XML for CI tools
                "junit:target/cucumber.xml",
        },

        // Enables running specific tagged tests
        tags = "@Login"
)

public class UIrunner {
}
