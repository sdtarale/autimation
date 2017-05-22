package Launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sank {

	
     WebDriver driver;  
     @Before  
     public void setup() throws Exception {  
 	System.setProperty("webdriver.chrome.driver", "F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");

     driver=new FirefoxDriver();  
     String URL="http://www.seleniummaster.com";   
     driver.get(URL);  
     driver.manage().window().maximize();  
     }  
     @Test  
     public void test() throws Exception {   
     // Opening site  
     driver.findElement(By.xpath("//img[@alt='SeleniumMasterLogo']")).click();  
     // Storing parent window reference into a String Variable  
     String Parent_Window = driver.getWindowHandle();    
      // Switching from parent window to child window   
     for (String Child_Window : driver.getWindowHandles())  
     {  
     driver.switchTo().window(Child_Window);  
     // Performing actions on child window  
     driver.findElement(By.id("dropdown_txt")).click();  
     List  dropdownitems=driver.findElements(By.xpath("//div[@id='DropDownitems']//div"));  
     int dropdownitems_Size=dropdownitems.size();  
     System.out.println("Dropdown item size is:"+dropdownitems_Size);  
     ((WebElement) dropdownitems.get(1)).click();  
     driver.findElement(By.xpath("//*[@id='anotherItemDiv']")).click();  
     }  
     //Switching back to Parent Window  
     driver.switchTo().window(Parent_Window);  
     //Performing some actions on Parent Window  
     driver.findElement(By.className("btn_style")).click();  
     }  
      @After  
      public void close() {  
      driver.quit();  
      }   
     }  