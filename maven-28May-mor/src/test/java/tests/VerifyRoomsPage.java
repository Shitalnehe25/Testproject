package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class VerifyRoomsPage {
	
	private WebDriver driver;
	private LoginPage login;
	private RoomsPage roomspage;
	private SoftAssert soft;
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Documents\\Automation\\seljar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void openRoomsPage() 
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com");
		
		login=new LoginPage(driver);
		login.openMessenger();
		
		MessengerPage messengerpage=new MessengerPage(driver);
		messengerpage.openRooms();
		
		roomspage=new RoomsPage(driver);
		soft=new SoftAssert();
	}
	@Test
	public void verifyReturnToMessenger()
	{
		System.out.println("Test1");
		//System.out.println("verifyReturnToMessenger");
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
	public void logOutFromApplication() {
		System.out.println("after method");
		System.out.println("Log out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After class");
		driver.close();
	}
}
	
	
	


