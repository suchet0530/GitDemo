import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.*;
import static org.openqa.selenium.By.*;
import static org.testng.Assert.assertEquals;


public class Locators {


    @Test
    public void practiceLocatorsAndLaunchingBrowser() throws InterruptedException {
        // TODO Auto-generated method stub
        //implicit wait - 2 seconds time ou
        WebDriver driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(ofSeconds(5));
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(5000);
        driver.findElement(id("inputUsername")).sendKeys("raghu");
        driver.findElement(name("inputPassword")).sendKeys("hello world");
        driver.findElement(className("signInBtn")).click();
        System.out.println(driver.findElement(cssSelector("p.error")).getText());
        driver.findElement(linkText("Forgot your password?")).click();
        driver.findElement(xpath("//input [@placeholder='Name']")).sendKeys("suchet");
        driver.findElement(cssSelector("input[placeholder='Email']")).sendKeys("raghu@gmail.com");
        driver.findElement(cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(cssSelector("input[type='text']:nth-child(3)")).sendKeys("vijaya@rsa.com");
        driver.findElement(xpath("//form/input[3]")).sendKeys("9848022668");
        driver.findElement(cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(cssSelector("#inputUsername")).sendKeys("raghavendran0530@outlook.com");
        driver.findElement(cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


    }
}
