package infrastructura.wdm;

import infrastructura.config.BrowserType;
import infrastructura.config.ConfigurationManager;
import infrastructura.wdm.capabilities.PlatformCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudWebDriverFactory implements WebDriverFactory {
    DesiredCapabilities caps = new DesiredCapabilities();
    WebDriver driver;
    String LOGIN;
    String ACCESS_KEY;

    public WebDriver create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                caps.merge(PlatformCapabilities.cromeCapabilitiesCloud());
                break;
            case FIREFOX:
                caps.merge(PlatformCapabilities.fireFoxCapabilitiesCloud());
            default:
                throw new IllegalArgumentException(String.format("unable to created driver with type %s",testBrowser));
        }
         try {
         return new RemoteWebDriver(
                    new URL("http://" + LOGIN + ":" +
                            ACCESS_KEY +"@ondemand.saucelabs.com:80/wd/hub"),
                    caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
         return driver;
    }
}
