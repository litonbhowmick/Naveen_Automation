package PageActions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dropdown {

    WebDriver driver;
    WebDriverWait wait;

    public Dropdown(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void SelectOptionFromDropdownByVisibleText(WebElement element, String option){
        try {
            Select select = new Select(wait.until(ExpectedConditions.visibilityOf(element)));
            select.selectByVisibleText(option);
        } catch (StaleElementReferenceException e){
            SelectOptionFromDropdownByVisibleText(element,option);
        }
    }

    public void SelectOptionFromDropdownByIndex(WebElement element, int option){
        try {
            Select select = new Select(wait.until(ExpectedConditions.visibilityOf(element)));
            select.selectByIndex(option);
        } catch (StaleElementReferenceException e){
            SelectOptionFromDropdownByIndex(element,option);
        }
    }

    public void SelectOptionFromDropdownByValue(WebElement element, String option){
        try {
            Select select = new Select(wait.until(ExpectedConditions.visibilityOf(element)));
            select.selectByValue(option);
        } catch (StaleElementReferenceException e){
            SelectOptionFromDropdownByValue(element, option);
        }

    }
}
