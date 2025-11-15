package PageActions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButton {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    JavascriptExecutor js;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void clickOnRadiobutton(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
            try {
                //click using selenium
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            } catch (ElementClickInterceptedException e) {
                try {
                    //click using actions
                    actions = new Actions(this.driver);
                    actions.moveToElement(element).click().perform();
                } catch (ElementClickInterceptedException e1) {
                    //click using JS
                    js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].click();", element);
                }
            }
        } catch (StaleElementReferenceException e) {
            clickOnRadiobutton(element);
        }
    }
}
