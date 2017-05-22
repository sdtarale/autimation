package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrcaticeCode3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(3000);
		String Actual=driver.getTitle();
		String Expected="actiTIME -  Enter Time-Track";
		if(Expected.equals(Actual))
		{
			System.out.println("The Title Page is matched");
		}
		else
		{
			driver.close();
		}
	}

}
