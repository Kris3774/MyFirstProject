package infrastructura.wdm;

import infrastructura.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class Action {
    WaitUtils wait ;
    WebDriver driver;

    public Action(WebDriver driver) {
        this.wait = new WaitUtils(driver);
        this.driver = driver;

    }

    public void click(WebElement element) {
        try {
            wait.elementClickable(element);
            element.click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException(element + " is not found ");
        }
    }

    public void typeText(String input, WebElement intoElement) {
        try {
            wait.elementVisibility(intoElement);
            intoElement.clear();
            intoElement.sendKeys(input);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public String getText(WebElement element) {
        String text = "";
        try {
            wait.elementVisibility(element);
            text = element.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }return text;

    }
    public void scrollPageDown(WebElement element){
        try {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public void scrollPageUp(WebElement element){
        try {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
