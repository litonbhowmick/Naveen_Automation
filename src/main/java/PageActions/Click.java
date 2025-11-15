package PageActions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Click {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    WebElement webElement;

    public Click(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void clickUsingSelenium(WebElement element) {
        try {
            webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
            try {

                //click using selenium
                webElement.click();

            } catch (ElementClickInterceptedException e) {
                try {

                //click using actions
                    actions = new Actions(this.driver);
                    actions.moveToElement(element).click().perform();

                } catch (ElementClickInterceptedException e1){

                //click using javaScript
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].click();",element);
                }
            }
        }
        catch (StaleElementReferenceException exception){
            clickUsingSelenium(element);
        }
    }

}
