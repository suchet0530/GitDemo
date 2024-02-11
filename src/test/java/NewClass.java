import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass {
    @Test
    public static void practiceLocatorsAndLaunchingBrowser() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("raghavendran0530@outlook.com");
        driver.findElement(By.id("continue")).click();



    }
}
