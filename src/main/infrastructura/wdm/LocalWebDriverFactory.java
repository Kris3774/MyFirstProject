package infrastructura.wdm;

import infrastructura.config.BrowserType;
import infrastructura.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalWebDriverFactory implements WebDriverFactory{

    public WebDriver create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException(String.format("unable to create driver ",testBrowser));
        }
    }
}
