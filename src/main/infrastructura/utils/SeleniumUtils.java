package infrastructura.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
    public static void switchToWindowByTitle(WebDriver driver,String title){
    for (String window : driver.getWindowHandles()){
      driver.switchTo().window(window);
      if(driver.getTitle().equals(title)){
         break;
      }
    }
    }
    public static void switchToWindowUrlContains (WebDriver driver,String url){
         for (String window : driver.getWindowHandles()){
                driver.switchTo().window(window);
                if(driver.getCurrentUrl().contains(url)){
                    break;
                }
            }
    }
    public static void returnToParentWindow (){

    }
}
