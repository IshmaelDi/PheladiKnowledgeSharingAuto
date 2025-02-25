package eTalent_StepsDefinitions;

import eTelant_LoginPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UIsteps extends PageObject {

    @Steps
    LoginPage loginPage;

    @Given("the user is on the eTalent login page")
    public void theUserIsOnTheEtalentLoginPage() {
        // Opens the eTalent homepage
        loginPage.open_eTalent_homepage();
    }

    @When("the user logs in with username {string} and password {string}")
    public void theUserLogsInWithUsernameAndPassword(String username, String password) {
        // Performs login action
        loginPage.login("lebodirero@gmail.com", "Ish@cyest#982");
    }

    @Then("the user should be redirected to the dashboard page")
    public void theUserShouldBeRedirectedToTheDashboardPage() {
        // Assert successful login (adjust URL or validation logic accordingly)
        String currentUrl = loginPage.getDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("dashboard"));
    }
//
//    @Then("an error message {string} should be displayed")
//    public void anErrorMessageShouldBeDisplayed(String expectedErrorMessage) {
//        // Assert error message is displayed on unsuccessful login
//        boolean isErrorDisplayed = loginPage.getDriver()
//                .findElement(By.xpath("//*[contains(text(), '" + expectedErrorMessage + "')]")) // Update XPath based on actual UI
//                .isDisplayed();
//        assertTrue(isErrorDisplayed);
//    }

}
