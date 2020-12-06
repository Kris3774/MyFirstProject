package infrastructura.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserCapabilities {
    private static RemoteWebDriver driver;

    public static Capabilities cromeCapabilities() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "67");
        chromeOptions.setCapability("platform", "Windows Xp");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(chromeOptions);
        return desiredCapabilities;
    }

    public static Capabilities fireFoxCapabilities() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(firefoxOptions);
        return desiredCapabilities;
    }
}
