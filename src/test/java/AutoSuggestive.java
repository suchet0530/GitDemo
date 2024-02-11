import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestive {
    @Test
    public static void practiceLocatorsAndLaunchingBrowser() throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
       List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

       for(WebElement option  :options)
       {
           if(option.getText().equalsIgnoreCase("India"))
           {
               option.click();
               break;
           }
       }




    }


}
