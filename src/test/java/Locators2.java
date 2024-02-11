import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.By.*;
import static org.testng.Assert.assertEquals;

public class Locators2 {
    public static void main(String[]args)  throws InterruptedException {
        // TODO Auto-generated method stub
        //implicit wait - 2 seconds time ou
        String name ="suchetayansh";
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(5000);
        driver.findElement(id("inputUsername")).sendKeys(name);
        driver.findElement(name("inputPassword")).sendKeys(password);
        driver.findElement(className("signInBtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();


    }
    public static String getPassword(WebDriver driver ) throws InterruptedException
    {
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(cssSelector(".reset-pwd-btn")).click();
        String passwordText =driver.findElement(cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
         String[] passwordArray = passwordText.split("'");
  //     String[] passwordArray2 = passwordArray[1].split("'") [0];
  //     passwordArray2[0]
        String password = passwordArray[1].split("'")[0];
        return password;

        //0th index - Please use temporary password
        //1st index - rahulshettyacademy' to login.

        //0th index - rahulshettyacademy
        //1st index - to Login.








    }
}



