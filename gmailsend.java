package Launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gmailsend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("taraleshahu",Keys.ENTER);
		driver.findElement(By.id("Passwd")).sendKeys("doulatmalu1",Keys.ENTER);
		driver.findElement(By.xpath(".//div[text()='COMPOSE']")).click();
		WebElement e = driver.findElement(By.xpath(".//div[@id=':131']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).sendKeys("shahu_t@rediffmail.com").perform();
		WebElement b= driver.findElement(By.id(".//div[@id=':12s']"));
		a.moveToElement(e).sendKeys("Projects").perform();
		
		
	}

}
