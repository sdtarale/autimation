package Launch;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,30);
        driver.get("file:///C:/Users/Shahu D Tarale/Desktop/practice/iframe.html");
        driver.switchTo().frame("w3c");
        driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
        driver.findElement(By.name("search")).sendKeys("Shahu");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        //  driver.findElement(By.xpath("html/body/a")).click();
        WebElement e=driver.findElement(By.xpath("//iframe[@title='Selenium_news']"));
        driver.switchTo().frame(e);
        driver.findElement(By.xpath(".//a[@title='Selenium Projects']")).click();
        String s="window.scroll(500,500)";
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript(s);
        driver.switchTo().defaultContent();
        List<WebElement> list=driver.findElements(By.xpath("//iframe"));
        Iterator<WebElement> it=list.iterator();
        System.out.println(list.size());
        while(it.hasNext())
        {
        	System.out.println(it);
        	it.next();
        }
        
        
	}

}
