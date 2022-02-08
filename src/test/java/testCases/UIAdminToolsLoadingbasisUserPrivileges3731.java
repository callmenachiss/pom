package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;

public class UIAdminToolsLoadingbasisUserPrivileges3731 extends BaseClass
{
	@Test
	public void UIAdminToolsLoadingbasisUserPrivilegesPC_3731() throws IOException, InterruptedException 
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
		WebElement Admin = driver.findElement(By.xpath("//a[contains(text(),'Administrative Tools')]"));
		if(Admin.isDisplayed())
		{
			hp.clickAdminTools();
			logger.info("User is an Admin & access for AdminTools options");
			captureScreen(driver,"User is an Admin");
		}
		else
		{
			logger.info("User is not an Admin for AdminTools options");
			captureScreen(driver,"User is not an Admin");
		}
		
		logger.info("Scenario - verify the User is an Admin Access or not -- Passed");
		
		
		
	}

}
