package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.communityPages;

public class UICreatePosts3729 extends BaseClass
{

	@Test
	public void UICreatePostsPC_3729() throws IOException, InterruptedException 
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
		cp.clickTextbox();
		logger.info("User creating the new post in view post page");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickpost();		
		logger.info("Scenario - verify the User is able to create the post -- Passed");
	}
}
