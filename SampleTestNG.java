package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNG {
	String s="taraleshahu";
@Test
public void asserts() throws InterruptedException
{
 System.setProperty("webdriver.chrome.driver", "F:\\Shahusel\\chromedriver_win32 (2)\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 WebDriverWait wait=new WebDriverWait(driver,20);
 driver.get("https://www.irctc.co.in");
 driver.findElement(By.className("loginCaptcha"));
 

 driver.close();
}



 }