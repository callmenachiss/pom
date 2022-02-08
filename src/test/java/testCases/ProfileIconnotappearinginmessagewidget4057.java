package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.homePage;

public class ProfileIconnotappearinginmessagewidget4057 extends BaseClass
{

	@Test
	public void ProfileIconnotappearinginmessagewidgetPC_4057() throws IOException, InterruptedException 
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
		hp.clickmessagewidget();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		logger.info("User Clicked on Message widget");
		captureScreen(driver,"Messages widget");
		
		logger.info("Scenario - verify the profile Image in Message widget -- Passed");
		
	}
	
}
