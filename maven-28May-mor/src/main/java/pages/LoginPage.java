package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
			//declaration of webElement
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement createNewAcc;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messengerLink;
	
	//Initialization of WebElement
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//use of webElement
	
	public void sendUserName()
	{
		userName.sendKeys("velocity@gmail.com");
	}
	public void sendPassword() 
	{
		password.sendKeys("123456");
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	public void clickOnCreateNewAcc()
	{
		createNewAcc.click();
	}
	public void openMessenger()
	{
		messengerLink.click();
	}
	//or//
/*	
	public void loginFacebook() {
		
		userName.sendKeys("velocity");
		password.sendKeys("123456");
		loginButton.click();
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
