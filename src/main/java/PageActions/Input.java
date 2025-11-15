package PageActions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Input {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;

    public Input(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void enterText(WebElement element,String text){
        try{
            try {
                wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
            } catch (ElementNotInteractableException e){
                try {
                    actions = new Actions(this.driver);
                    actions.moveToElement(element).sendKeys(text).perform();
                } catch (ElementNotInteractableException e1){
                    js = (JavascriptExecutor) this.driver;
                    js.executeScript("arguments[0].value='"+text+"'",element);
                }
            }
        } catch (StaleElementReferenceException e){
            enterText(element,text);
        }
    }

}
