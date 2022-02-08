package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.communityPages;

public class UIViewPostEditedTimestamp3793 extends BaseClass
{

	@Test
	public void UIViewPostEditedTimestampPC_3793() throws IOException, InterruptedException 
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
		
		
		captureScreen(driver,"View Post - No Post");		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickTextbox();
		logger.info("User Entered the https post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Text only post");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickPostControls();		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickEditButton();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickEdittext();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickUpdatebutton();
		logger.info("User is edited the text post using post controls option");
		logger.info("Scenario - Verify the View Post Edited Timestamp is updated correctly in view post of discussion page -- Passed");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		captureScreen(driver,"View Post Edited Timestamp");
	}
	
}
