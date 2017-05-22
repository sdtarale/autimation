package Launch;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Shahusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\Shahu D Tarale\\Desktop\\practice\\open.exe");
		//runtime is used to double click on any file.
		driver.get("file:///C:\\Users\\Shahu D Tarale\\Desktop\\practice\\testpage.html");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
	}

}
