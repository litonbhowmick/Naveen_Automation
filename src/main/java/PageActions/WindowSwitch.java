package PageActions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class WindowSwitch {

    WebDriver driver;
    WebDriverWait wait;

    public WindowSwitch(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));
    }

    ArrayList<String> list_windows;

    public void switchToWindow(String targetWindow) {
        try {
            list_windows = new ArrayList<>(driver.getWindowHandles());
            String parentWindow = list_windows.get(0);

            for (String window : list_windows) {
                if (!window.equalsIgnoreCase(parentWindow)) {
                    if (window.equalsIgnoreCase(targetWindow)) {
                        driver.switchTo().window(window);
                    }
                }
            }
        } catch (StaleElementReferenceException e){
            switchToWindow(targetWindow);
        }
    }

    public void switchToDefaultWindow(){
        list_windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().defaultContent();
    }

}
