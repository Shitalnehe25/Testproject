package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class TestClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Documents\\Automation\\seljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		
		LoginPage login=new LoginPage(driver);
		login.openMessenger();
		
		MessengerPage messengerpage=new MessengerPage(driver);
		messengerpage.openRooms();
		
		RoomsPage roomspage=new RoomsPage(driver);
		roomspage.contactHelpCenter();
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
