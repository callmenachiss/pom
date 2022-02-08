package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.communityPages;

public class UIParseHyperlinksinPosts3736 extends BaseClass
{

	@Test
	public void UIParseHyperlinksinPostsPC_3736() throws IOException, InterruptedException 
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
		cp.clickhttps();
		logger.info("User Entered the https post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Hyperlink-https");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clickhttp();
		logger.info("User Entered the http post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Hyperlink-http");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.clicksameurl();
		logger.info("User Entered the same url in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Hyperlink-sameurl");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.click_text_http_protocol();
		logger.info("User Entered the text + http post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Text + http Hyperlink");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.click_text_https_protocol();
		logger.info("User Entered the text + https post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Text + https Hyperlink");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.click_multipleurl_protocol();
		logger.info("User Entered the multiple url post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Multiple Hyperlink");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.click_text_multipleurl_protocol();
		logger.info("User Entered the text + multiple url post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Text + Multiple Hyperlink");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		cp.click_ftp_protocol();
		logger.info("User Entered the ftp url post in textbox");
		cp.clickpost();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		captureScreen(driver,"Hyperlink-FTP");
		
		logger.info("Scenario - verify the Hyperlinks in create/view Post & Comments -- Passed");
		
		
		
	
}

}	