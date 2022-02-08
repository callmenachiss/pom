package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	// Locators for Login page
	
	@FindBy(id="identifier")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	@CacheLookup
	WebElement btnNext;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	@CacheLookup
	WebElement btnLogin;
	
	
	
	
	
	//Method Declaration for the above locators
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
		
	public void clickNext()
	{
		//ldriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		btnNext.click();
	}	
	
	public void clickLogin()
	{
		//ldriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		btnLogin.click();
	}
	
}
