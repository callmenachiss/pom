package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;

public class UIPrivacyPolicyLinktobeupdated3883 extends BaseClass
{

	@Test
	public void UIPrivacyPolicyLinktobeupdatedPC_3883() throws IOException, InterruptedException 
	{
		//Object creation for pageobjects
		
	    LoginPage lp=new LoginPage(driver);
	    homePage  hp=new homePage(driver);	
		
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
		hp.click_privacy_policy_link();
		logger.info("Clicked on Privacy Policy link");
		
		logger.info("Scenario - verify the functionality of Privacy Policy Link -- Passed");
		
	}
	
}
