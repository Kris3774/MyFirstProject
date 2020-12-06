package infrastructura.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    WebDriver driver;
    WebDriverWait wait;


    public static void waitABit(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {


        }
    }

    public void elementClickable(WebElement item) {
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(String.valueOf(item))));
    }

    public void elementVisibility(WebElement item) {
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(String.valueOf(item))));
    }

    public void containsText() {
        Boolean element3 = wait.until(ExpectedConditions.textToBe(By.id("text"), "some text"));
    }


}
