package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.homePage;
import utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) 
	{
		//Object creation for pageobjects
		
		LoginPage lp=new LoginPage(driver);
		homePage  hp=new homePage(driver);
				
		
		logger.info("URL is opened");		
		lp.setUserName(username);
		logger.info("Entered username");
		lp.clickNext();
		logger.info("Clicked on Next Button");
		lp.setPassword(password);
		logger.info("Entered password");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lp.clickLogin();
		logger.info("Clicked on Sign-in Button");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		hp.clickMenuHeader();
		logger.info("Clicked on MenuHeader");
		hp.clickLogOut();
		logger.info("Clicked on LogOut");
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}
