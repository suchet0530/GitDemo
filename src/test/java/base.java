import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class base {
    @Test
    public static void practiceLocatorsAndLaunchingBrowser() throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        String[] names = {"Cucumber", "Brocolli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();

            if (name.contains("Cucumber")) {
                //click on Add to cart
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;

            }
        }
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();

            if (name.contains("Brocolli")) {
                //click on Add to cart
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }

        }
    }

}

