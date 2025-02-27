package eTalentePageObjectsAndElements;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenuAppElements_Object extends PageObject {

    //elements

    private static final String MENU_XPATH = "//*[@id=\"etalente_sidenav\"]/div/div/div[1]/button/span[1]/mat-icon";
    private static final String JOB_OFFERS_XPATH = "(//span[normalize-space()='Job Offers/Contracts'])[1]";
    private static final String JOB_POSTS_XPATH = "(//span[normalize-space()='Job Posts'])[1]";


    // Additional methods can be added here for actions on the
//public void clickMenu(){
//    $(MENU_XPATH).click();
//}

public void clickJobOffers(){
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOB_OFFERS_XPATH))).click();



//    $(JOB_OFFERS_XPATH).click();
}
public void clickJobPosts(){
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOB_POSTS_XPATH))).click();


//    $(JOB_POSTS_XPATH).click();

}


}


