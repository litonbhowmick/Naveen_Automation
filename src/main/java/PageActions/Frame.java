package PageActions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frame {

    WebDriver driver;
    WebDriverWait wait;

    public Frame(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    public void SwitchToFrameByElement(WebElement element) {
        try {

            this.driver.switchTo().frame(element);

        } catch (StaleElementReferenceException e) {
            SwitchToFrameByElement(element);
        }
    }

    public void SwitchToFrameByElement(int index) {
        try {
            this.driver.switchTo().frame(index);

        } catch (StaleElementReferenceException e) {
            SwitchToFrameByElement(index);
        }
    }

    public void SwitchToFrameByElement(String text) {
        try {
            this.driver.switchTo().frame(text);

        } catch (StaleElementReferenceException e) {
            SwitchToFrameByElement(text);
        }
    }

}
