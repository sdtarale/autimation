package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirtsSample {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, Exception  {
		DDTSampleGeneric ddt=new DDTSampleGeneric();
		ddt.toExel("F:\\sdt.xlsx","Sheet1","shahutarale",0,0);
		ddt.fromExel("F:\\sdt.xlsx","Sheet1",0,0);
		ddt.fromProperty("C:\\Users\\Shahu D Tarale\\Desktop\\practice\\medi.property", "Browser", "URL", "UserName", "Password");
		ddt.toProperty("C:\\Users\\Shahu D Tarale\\Desktop\\practice\\medi.property", "Browser","oOpera", "URL", "www.IamShahuTarale.com", "UserName", "taraleshahu@gmail.com", "Password", "doulatmaluTarale");
		ddt.fromProperty("C:\\Users\\Shahu D Tarale\\Desktop\\practice\\medi.property", "Browser", "URL", "UserName", "Password");

		
		}

}
