import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestWindowHandles {
    @Test
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        //Single window
       // String parentWindowHandle = driver.getWindowHandle();
        //System.out.println("Parent window handle - " + parentWindowHandle + driver.getTitle());
        //driver.findElement(By.id("newWindowBtn")).click();
        //Set<String> windowHandles = driver.getWindowHandles();
        //for (String windowHandle : windowHandles) {
            //if (!windowHandle.equals(parentWindowHandle)) {
               // driver.switchTo().window(windowHandle);
                //driver.manage().window().maximize();
                //driver.findElement(By.id("firstName")).sendKeys("SUCHETAYANSH");
                //Thread.sleep(3000);
                //driver.close();

            }
              //  System.out.println("windowHandle" + driver.getTitle());
            }
        //driver.switchTo().window(parentWindowHandle);
        //driver.findElement(By.id("name")).sendKeys("HYR Tutorials");


           //Single Tab










