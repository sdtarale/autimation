package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeCode {
	

	public static String  method1(String fname,String sname,int rindex, int cindex) throws Exception 
		{
		// TODO Auto-generated method stub
        //Error if use thisSystem.setProperty("webdriver.gecko.firefoxdriver","F:\\Shahusel\\geckodriver-v0.11.1-win64 (1)\\geckodriver.exe");
		String data=null;
		File f=new File("F:\\Selenium WorkSpace\\"+ fname +".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sname);
		int lastRowNum=s.getLastRowNum();
		System.out.println("The Last Row Num: "+ lastRowNum);
		for(int i=0;i<=lastRowNum;i++)
		{
			Row rw=s.getRow(i);
			int lastCellNum=rw.getLastCellNum();
			//System.out.println("The Last Cell Num: "+ lastCellNum);
			for(int j=0;j<lastCellNum;j++)
			{
				Cell c=rw.getCell(j);
				data=c.toString();
				System.out.print(data+ "\t");
			}
			System.out.println();
		}
		
		return data;
	}
	public static void  methodProp(String file,String ul, String un,String pass,String brw)
	{
		try
		{
		File f=new File("F:\\Selenium WorkSpace\\"+ file +".property");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty(ul));
		System.out.println(prop.getProperty(un));
		System.out.println(pass);
		System.out.println(brw);
		
		}
		catch(Exception e)
		{
			
		}
	}
	public static void method2(String fname1,String sname1,int rindex1, int cindex1,String fname2,String key1,String value1) throws Exception
	{
		File f= new File("F:\\Selenium WorkSpace\\"+ fname1 +".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sname1);
		Row rw=s.getRow(rindex1);
		Cell c=rw.createCell(cindex1);
		c.setCellValue("bomber");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		File p=new File("F:\\Selenium WorkSpace\\"+ fname2 +".property");
		FileInputStream fis2=new FileInputStream(p);
		FileOutputStream fos2=new FileOutputStream(p,true);
		Properties prop=new Properties();
		prop.load(fis2);
		prop.setProperty(key1, value1);
		prop.store(fos2, "hello");
	}
	
}
