import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowActivities {

    public static void main (String[]args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.get("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
