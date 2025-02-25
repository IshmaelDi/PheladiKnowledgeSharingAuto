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
    private static final String ETALENT_HOMEPAGE_XPATH = "/html/body/app-root/app-home/div/div[1]/div/div[1]/div[2]/a[2]/span[1]";
    private static final String URL = "https://www.etalent.com.ng/";
    private static final String USERNAME_INPUT_XPATH = "Username";
    private static final String PASSWORD_INPUT_XPATH = "Password";
    private static final String LOGIN_BUTTON_XPATH = "Login";

    // Additional methods can be added here for actions on the login page

    public void open_eTalent_homepage() {
        getDriver()
    }
}