package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// declaration
	@FindBy (xpath="//input[@aria-label='Search Messenger']")
	private WebElement  messenger;
	
	@FindBy (xpath="(//a[@role='link'])[6]")
	private WebElement notification;
	
	@FindBy (xpath="//a[@aria-label='Friends']")
	private WebElement findfriends;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickOnMessenger() 
	{
		messenger.click();
	}
	public void clickOnNotification() 
	{
		notification.click();
	}
	public void clickOnFindfriends() 
	{
		findfriends.click();
	}
}
