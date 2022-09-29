package utils;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	static String s;
	static DateTimeFormatter dateTime;
	static WebDriver driver;
	
	
	public static WebDriver captureScreenshot(WebDriver driver,int testId) throws IOException {
		 
		 dateTime = DateTimeFormatter.ofPattern("DD_MM_YYYY_hh_mm_ss");
		 LocalDateTime now=	 LocalDateTime.now();
		 s=dateTime.format(now);
	//	 TakesScreenshot take=(TakesScreenshot)driver;
		 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("src\\test\\resources\\Projectscreenshot "+s+".jpeg");
		 FileHandler.copy(source, dest);
		 return driver;
		 }
	
//	public String void getDatafromExcelSheet(int a,int b) throws EncryptedDocumentException, IOException {
		
	//	r.get
		
	/*String path="C:\\Users\\Sai\\Desktop\\Velocity.xlsx";
		FileInputStream  file = new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh =wb.getSheet("velocity");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=0;j<2;j++) 
			{
				
			}
		}*/
		
		
	 	}
