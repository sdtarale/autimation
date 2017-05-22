package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Shahusel\\geckodriver-v0.11.1-win64 (1)\\geckodriver.exe");
		WebDriver driver=  new FirefoxDriver();
		driver.manage().window().maximize();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
