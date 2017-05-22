package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;


public class DDTSampleGeneric {
	static String data=null;
	public static String toExel(String fname, String sname, String value,int rindex, int cindex) throws Exception
	{
		File f=new File(fname);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sname);
		Row r=s.getRow(rindex);
		Cell c=r.getCell(cindex);
		c.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		return c.toString();
	}
	public static String fromExel(String fname, String sname,int rindex, int cindex) throws Exception
	{
		File f=new File(fname);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sname);
		Row r=s.getRow(rindex);
		Cell c=r.getCell(cindex);
		System.out.println(c.toString());
		return c.toString();
	}
	public static String toProperty(String fname, String b,String bvalue, String url, String uvalue,String un,String unvalue,String pw, String pwvalue) throws Exception
	{
		File f=new File(fname);
		FileInputStream fis=new FileInputStream(f);
		Properties  prop=new Properties();
		prop.load(fis);
		prop.setProperty(b,bvalue);
		prop.setProperty(url,uvalue);
		prop.setProperty(un,unvalue);
		prop.setProperty(pw,pwvalue);
		FileOutputStream fos=new FileOutputStream(f,true);
		prop.store(fos, "Edited");
		return data;
	}
	public static String fromProperty(String fname, String b,String url, String un,String pw) throws Exception
	{
		File f=new File(fname);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty(b));
		System.out.println(prop.getProperty(url));
		System.out.println(prop.getProperty(un));
		System.out.println(prop.getProperty(pw));
		return data;
	}
	}
