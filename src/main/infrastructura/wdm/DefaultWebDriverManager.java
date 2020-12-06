package infrastructura.wdm;

import infrastructura.config.ConfigurationManager;
import infrastructura.config.RunOn;
import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager {
    @Override
    public WebDriver getDriver() {
        RunOn runOn = ConfigurationManager.getInstance().getRunOn();
        WebDriverFactory factory;
        switch (runOn) {
            case LOCAL:
                factory = new LocalWebDriverFactory();
                break;
            case REMOTE:
                factory = new RemoteWebDriverFactory();
                break;
            case CLOUD:
                factory = new CloudWebDriverFactory();
                break;
            default:
                factory = new LocalWebDriverFactory();
        }
        return factory.create();
    }

    @Override
    public void destroyDriver(WebDriver driver) {
        if (driver!=null){
            driver.quit();;
        }
    }
}
