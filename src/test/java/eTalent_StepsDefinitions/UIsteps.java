package eTalent_StepsDefinitions;

import eTalentePageObjectsAndElements.MenuAppElements_Object;
import eTelant_LoginPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class UIsteps extends PageObject {

    @Steps
    LoginPage loginPage;
    MenuAppElements_Object menuAppElements_Object;

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
    public void verifyRedirectionToDashboardPage() {

   }

//    @And("the user click burger menu button on top right side")
//    public void theUserClickBurgerMenuButtonOnTopRightSide() {
//        menuAppElements_Object.clickMenu();
//    }

    @And("the user click job OffersContracts text link")
    public void theUserClickJobOffersContractsTextLink() {
        menuAppElements_Object.clickJobOffers();
    }

    @Then("the user click Job Posts text link")
    public void theUserClickJobPostsTextLink() {
        menuAppElements_Object.clickJobPosts();
    }
}
