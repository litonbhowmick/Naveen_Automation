package PageActions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkbox {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    JavascriptExecutor js;

    public Checkbox(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void selectCheckbox(WebElement element) {
        try {
            boolean elementIsSelected = wait.until(ExpectedConditions.elementToBeSelected(element));
            if (!elementIsSelected) {
                try {
                    //click using selenium
                    element.click();
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
            }
        } catch (StaleElementReferenceException e) {
            selectCheckbox(element);
        }
    }

    public void DeselectCheckbox(WebElement element) {
        try {
            boolean elementIsSelected = wait.until(ExpectedConditions.elementToBeSelected(element));
            if (elementIsSelected) {
                try {
                    element.click();
                } catch (ElementClickInterceptedException e) {
                    try {
                        actions = new Actions(this.driver);
                        actions.moveToElement(element).click().perform();
                    } catch (ElementClickInterceptedException e1) {
                        js = (JavascriptExecutor) driver;
                        js.executeScript("arguments[0].click();", element);
                    }
                }
            }
        } catch (StaleElementReferenceException e) {
            DeselectCheckbox(element);
        }
    }
}
