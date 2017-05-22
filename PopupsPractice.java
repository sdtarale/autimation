package Launch;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupsPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Shahusel\\geckodriver-v0.11.1-win64 (1)\\geckodriver.exe");
		WebDriver driver=  new FirefoxDriver();
		Runtime.getRuntime().exec("C://Users/Shahu D Tarale/Desktop/practice/filer.exe");
		driver.get("File:///C:\\Users\\Shahu D Tarale\\Desktop\\practice\\testpage.html");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		
		
	}

}
