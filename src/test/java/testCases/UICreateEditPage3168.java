package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utilities.ReadConfig;

public class UICreateEditPage3168 
{

	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		logger = Logger.getLogger("concerto");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	
	    
		driver.get("https://collaborationdevi.premierinc.com/editor");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		logger.info("Screenshot taken");
	}
	
	@Test
	public void UICreateEditPagePC_3168() throws IOException, InterruptedException 
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
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		logger.info("User Clicked on Editer page");
		captureScreen(driver,"Editer Page");
		logger.info("Scenario - verify the functionality of Editor Page tab -- Passed");
		
	}
	
}
