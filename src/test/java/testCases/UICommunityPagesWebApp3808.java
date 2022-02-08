package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.communityPages;

public class UICommunityPagesWebApp3808 extends BaseClass
{

	@Test
	public void UICommunityPagesWebAppPC_3808() throws IOException, InterruptedException 
	{
		//Object creation for pageobjects
		
	    LoginPage lp=new LoginPage(driver);
	    communityPages  cp=new communityPages(driver);	
		
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
		cp.clickPagestab();
		logger.info("User Clicked on Pages subtab in community");
		captureScreen(driver,"PagesTab");
		logger.info("Scenario - verify the community pages -- Passed");
		
	}
}
