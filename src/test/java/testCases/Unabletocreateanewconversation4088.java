package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;

public class Unabletocreateanewconversation4088 extends BaseClass
{

	@Test
	public void UnabletocreateanewconversationPC_4088() throws IOException, InterruptedException 
	{
		//Object creation for pageobjects
		
	    LoginPage lp=new LoginPage(driver);
		homePage  hp=new homePage(driver);	
		
		
		logger.info("URL is opened");		
		lp.setUserName(username);
		logger.info("Entered username");
		captureScreen(driver,"User entered the username");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.clickNext();
		logger.info("Clicked on Next Button");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.setPassword(password);
		logger.info("Entered password");
		captureScreen(driver,"User entered the password");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.clickLogin();
		logger.info("Clicked on Sign-in Button");
		
		WebElement logo = driver.findElement(By.cssSelector("image[id='logomark']"));
		if(logo.isDisplayed())
		{
			captureScreen(driver,"Homepage of the Application");
		}
		else
		{
			driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
			captureScreen(driver,"Homepage of the Application");
		}
}
	
}
