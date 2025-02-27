package eTelant_LoginPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends PageObject { // Renamed class to follow naming conventions

    // Extracted constants for better organization
    private static final String ETALENT_HOMEPAGE_XPATH = "//span[normalize-space()='Log In']";
    // /html/body/app-root/app-home/div/div[1]/div/div[1]/div[2]/a[2]/span[1]
    private static final String URL = "https://etalente.co.za/";
    private static final String USERNAME_INPUT_XPATH = "(//input[@id='mat-input-2'])[1]";
    private static final String PASSWORD_INPUT_XPATH = "(//input[@id='mat-input-3'])[1]";
    private static final String LOGIN_BUTTON_XPATH = "//span[contains(text(),'Login')]";

    private static final String dashboard_XPATH = "//*[@id=\"etalente_sidenav\"]/div/div/div[1]/div[1]/a/img";
//
//    private static final String MENU_XPATH = "(//mat-icon[normalize-space()='menu'])[1]";
//    private static final String JOB_OFFERS_XPATH = "(//span[normalize-space()='Job Offers/Contracts'])[1]";


    // Additional methods can be added here for actions on the login page

    public void open_eTalent_homepage() {

        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    public void login(String username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ETALENT_HOMEPAGE_XPATH))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(USERNAME_INPUT_XPATH))).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PASSWORD_INPUT_XPATH))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGIN_BUTTON_XPATH))).click();
    }

    public void JobList(String URL){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dashboard_XPATH)));
        assert(getDriver().getCurrentUrl().equals(URL));


    }

    private boolean isRedirectedToDashboardPage() {
        return true;
    }


}


