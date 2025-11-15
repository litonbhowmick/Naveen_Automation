package Helper;

import PageActions.*;
import Utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DriverFactory {

    ConfigReader reader = new ConfigReader();
    ThreadLocal<WebDriver> tldriver;
    Click click;
    Checkbox checkbox;
    Dropdown dropdown;
    Frame frame;
    Input input;
    RadioButton radioButton;
    WindowSwitch windowSwitch;

    public synchronized WebDriver getdriver() {
        try {
            tldriver = new ThreadLocal<WebDriver>();
            String browser = reader.getProperties("browser");

            if (browser.equalsIgnoreCase("chrome")) {
                tldriver.set(WebDriverManager.chromedriver().getWebDriver());

            } else if (browser.equalsIgnoreCase("firefox")) {
                tldriver.set(WebDriverManager.firefoxdriver().getWebDriver());

            } else {
                tldriver.set(WebDriverManager.edgedriver().getWebDriver());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tldriver.get();
    }

    {
        click = new Click(getdriver());
        checkbox = new Checkbox(getdriver());
        dropdown = new Dropdown(getdriver());
        frame = new Frame(getdriver());
        radioButton = new RadioButton(getdriver());
        windowSwitch = new WindowSwitch(getdriver());
        input = new Input(getdriver());
    }

}
