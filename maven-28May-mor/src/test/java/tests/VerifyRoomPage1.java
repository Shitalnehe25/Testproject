package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import setup.Base;
import utils.Utility;

public class VerifyRoomPage1 extends Base {
	private WebDriver driver;
	private LoginPage login;
	private MessengerPage messengerpage;
	private RoomsPage roomspage;
	private SoftAssert soft;
	private int testid;
	 
	
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName)
	{
		System.out.println("browserName");
		if(browserName.equals("Chrome")) 
		{
			driver= openChromeBrowser();
		}
		if(browserName.equals("Firefox")) 
		{
			driver=openFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void createPOMObjects() {
		login=new LoginPage(driver);
		messengerpage=new MessengerPage(driver);
		roomspage=new RoomsPage(driver);
	}
	@BeforeMethod
	public void openRoomsPage() 
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com");
		
		login.openMessenger();
		messengerpage.openRooms();
		soft=new SoftAssert();
	}
	@Test//(enabled=false)
	public void verifyReturnToMessenger()
	{
		testid=1220;
		System.out.println("Test1");
		System.out.println("verifyReturnToMessenger");
		roomspage.gobackToMessenger();
		
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		soft.assertEquals(url,"https://www.messenger.com/");	
		soft.assertEquals(title,"Messenger");
		soft.assertAll();
	}
	@Test
	public void verifyContactToHelpCenter ()
	{
		 testid=1221;
		System.out.println("Test2");
		System.out.println("verifyContactToHelpCenter");
		roomspage.contactHelpCenter();
		
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		soft.assertEquals(url,"https://www.messenger.com/help","URL is wrong");	//hard assert
		soft.assertEquals(title,"Messenger Help Centre","Title of home page is wrong");
		
		soft.assertAll();
	}
	@AfterMethod
	public void logOutFromApplication(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver,1221);
		}
		System.out.println("after method");
		System.out.println("Log out");
	}
	@AfterClass
	public void clearObjects() {
		login=null;
		messengerpage=null;
		roomspage=null;
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("After class");
		driver.close();
		driver=null;
		System.gc();//garbage collector
		
	}
}
	
	
	


