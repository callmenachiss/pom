package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LoginPage;


public class UICommunitySettingPageDesignPC3350 extends BaseClass
{

	@Test
	public void UICommunitySettingPageDesignPC_3350() throws IOException, InterruptedException 
	{
		//Object creation for pageobjects
		
	    LoginPage lp=new LoginPage(driver);
	    	
		
		
	    // Execution starts
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
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement community = driver.findElement(By.xpath("//div[contains(text(),'Communities')]"));
		if(community.isDisplayed())
		{
			logger.info("User is having atleast one community in the list");
			captureScreen(driver,"User is in Communities Tab");
		}
		else
		{
			logger.info("User is not having any community");
			captureScreen(driver,"User don't have a community");
		}
		
		logger.info("Scenario - verify the Community settings page Design -- Passed");
		
		
		
	}
	
}
