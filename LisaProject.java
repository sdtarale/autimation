package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LisaProject {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	    File f= new File("C:\\Users\\Shahu D Tarale\\Desktop\\practice\\medi.property");
	    		        FileInputStream fis= new FileInputStream(f);
	    		        Properties prop=new Properties();
	    		        prop.load(fis);
	    		        String ct=prop.getProperty("city");
	    		        String dc=prop.getProperty("Doctor");

	    		        System.setProperty("webdriver.chrome.driver",
	    		        		"F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");
	    		        WebDriver chrome=new ChromeDriver();
	    		        chrome.manage().window().maximize();
	    		        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    		        WebDriverWait wait=new WebDriverWait(chrome,30);
	    		        chrome.get("http://www.medinfi.com");
	    		        WebElement e = chrome.findElement(By.id("city-locality1"));
	    		        e.clear();
	    		        e.sendKeys(ct);
	    		        wait.until(ExpectedConditions.textToBePresentInElementValue(e,ct));
	    		        chrome.findElement(By.xpath(".//li/a[text()='Bengaluru']")).click();
	    		        WebElement d = chrome.findElement(By.id("ip1_text1"));
	    		        d.clear();
	    		        d.sendKeys(dc);
	    		        wait.until(ExpectedConditions.textToBePresentInElementValue(d,dc));
	    		        List<WebElement> list= chrome.findElements(By.id("res_label2"));
	    		        System.out.println(list.size());
	    		        for(int i=0;i<list.size();i++)
	    		        {
	    		        	list= chrome.findElements(By.id("res_label2"));
	    		            System.out.println(list.get(i).getText());
	    		        }
	    		       chrome.close();
	}

}
