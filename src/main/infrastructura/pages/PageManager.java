package infrastructura.pages;

import infrastructura.wdm.Action;
import org.openqa.selenium.WebDriver;

public abstract class  PageManager {
    WebDriver driver;
    Action action;

    public PageManager(WebDriver driver) {
        this.driver = driver;
        this.action = new Action(driver);
    }
}
