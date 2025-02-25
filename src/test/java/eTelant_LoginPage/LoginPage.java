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

public class LoginPage extends PageObject { // Renamed class to follow naming conventions

    // Extracted constants for better organization
    private static final String ETALENT_HOMEPAGE_XPATH = "//a[contains(@href, 'login')]";
    private static final String URL = "https://etalente.co.za/";
    private static final String USERNAME_INPUT_XPATH = "//input[@name='username']";
    private static final String PASSWORD_INPUT_XPATH = "//input[@name='password']";
    private static final String LOGIN_BUTTON_XPATH = "//button[text()='Login']";

    // Additional methods can be added here for actions on the login page

    public void open_eTalent_homepage() {

        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    public void login(String username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ETALENT_HOMEPAGE_XPATH))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(USERNAME_INPUT_XPATH))).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PASSWORD_INPUT_XPATH))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGIN_BUTTON_XPATH))).click();
    }
}

