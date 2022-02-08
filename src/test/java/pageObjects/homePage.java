package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage 
{

	WebDriver ldriver;
	
	public homePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	// Locators for Home page
	
	@FindBy(xpath="//header/div[2]/nav[2]/button[1]")
	@CacheLookup
	WebElement menu_header;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/button[1]")
	@CacheLookup
	WebElement messagewidget;
	
	@FindBy(xpath="//div[contains(text(),'Sign out')]")
	@CacheLookup
	WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'Administrative Tools')]")
	@CacheLookup
	WebElement AdminTools;
	
	@FindBy(linkText="Privacy Policy")
	@CacheLookup
	WebElement privacy_policy_link;
	
	
	
	
	//Method Declaration for the above locators
	
	public void clickMenuHeader()
	{
		menu_header.click();
	}
	
	public void clickLogOut()
	{
		if(logout.isDisplayed())
		{
		logout.click();
		}
		else
		{
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("window.scrollBy(0,60)", "");
			logout.click();
		}
	}
	
	public void clickmessagewidget()
	{
		messagewidget.click();
	}
	
	public void clickAdminTools()
	{
		AdminTools.click();
	}
	
	public void click_privacy_policy_link() throws IOException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) ldriver;
		js1.executeScript("window.scrollBy(0,550)", "");
		
		ldriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String parent = ldriver.getWindowHandle();
		
		privacy_policy_link.click();
		
		Set<String> allwindows = ldriver.getWindowHandles();
		
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				ldriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				ldriver.switchTo().window(child);
				File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:/eclipse-workspace/CollabWebApplication/Screenshots/Privacy-Policy Page.png"));
				ldriver.close();
			}
		}
		
		ldriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		ldriver.switchTo().window(parent);
		
		
	}
	
}
