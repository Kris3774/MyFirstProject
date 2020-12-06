package infrastructura.pages;

import infrastructura.wdm.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class MainPage extends PageManager{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage(String url){
        driver.get(url);
        return this;
    }

    @FindBy (id="ext-gen1190")
    WebElement FirstBug;
    List <WebElement> bugName=driver.findElements(By.id("vseyKolonki"));
    public WebElement findFirstBug(WebElement FirstBug, List<WebElement> customers) {
        for (WebElement customer : customers) {
            if (customer.getText().equals(FirstBug)) {
                return customer;
            }
        }
        return null;
    }

}
