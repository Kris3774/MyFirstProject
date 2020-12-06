package infrastructura.wdm;

import infrastructura.config.BrowserType;
import infrastructura.config.ConfigurationManager;
import infrastructura.wdm.capabilities.BrowserCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverFactory implements WebDriverFactory {
    DesiredCapabilities caps=new DesiredCapabilities();
    WebDriver driver;
    public WebDriver create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                caps.merge(BrowserCapabilities.cromeCapabilities());
                break;
            case FIREFOX:
                caps.merge(BrowserCapabilities.fireFoxCapabilities());
            default:
                throw new IllegalArgumentException(String.format("unable to created driver with type %s",testBrowser));
        }

        try {
            return new RemoteWebDriver(new URL(ConfigurationManager.getInstance().getRemoteHubUrl()),caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
