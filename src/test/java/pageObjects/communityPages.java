package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class communityPages 
{
   WebDriver ldriver;
   Actions act;
	
	public communityPages(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// Locators for Home page
	
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement text_field;
		
		@FindBy(xpath="//input[@type='text']")
		@CacheLookup
		WebElement image_textfield;
		
		@FindBy(xpath="//input[@type='file']")
		@CacheLookup
		WebElement post_multipleimage;
		
		@FindBy(xpath="//button[@type='submit']")
		@CacheLookup
		WebElement post_button;
		
		@FindBy(xpath="//div[contains(text(),'Communities')]")
		@CacheLookup
		WebElement community;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement https_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement http_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement sameurl_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement text_http_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement text_https_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement multipleurl_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement text_multipleurl_protocol;
		
		@FindBy(tagName="textarea")
		@CacheLookup
		WebElement ftp_protocol;
		
		@FindBy(xpath="//span[contains(text(),'Images')]")
		@CacheLookup
		WebElement imagebutton;
		
		@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]")
		@CacheLookup
		WebElement dragdrop;
	
		@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/*[1]")
		@CacheLookup
		WebElement postcontrols;
		
		@FindBy(xpath="//span[contains(text(),'Edit')]")
		@CacheLookup
		WebElement editbutton;
		            
		@FindBy(xpath="(//textarea[@placeholder='Share your thoughts'])[1]")
		@CacheLookup
		WebElement edittextfield;
		
		@FindBy(xpath="//span[contains(text(),'Update')]")
		@CacheLookup
		WebElement updatebutton;
		
		@FindBy(xpath="//span[contains(text(),'Pages')]")
		@CacheLookup
		WebElement pagestab;
		
		
	//Method Declaration for the above locators
		
		public void clickTextbox()
		{
			text_field.sendKeys("Post created by Automation Script");
		}
		
		public void clickUpdatebutton()
		{
			updatebutton.click();
		}
		
		public void clickEdittext()
		{
			Actions act = new Actions(ldriver);
			act.sendKeys(Keys.TAB).build().perform();
			edittextfield.sendKeys("Thank you!");
			
		}
		
		public void clickEditButton()
		{
			editbutton.click();
		}
		
		public void clickPostControls()
		{
			postcontrols.click();
		}
		
		public void clickImageTextbox()
		{
			image_textfield.sendKeys("Post created by Automation Script");
		}
		
		public void postMultipleImage() throws IOException
		{
			    post_multipleimage.sendKeys("E:\\nkaruppi\\45.jpg");
				post_multipleimage.sendKeys("E:\\nkaruppi\\123.jpg");
				post_multipleimage.sendKeys("E:\\nkaruppi\\covid.jpg");
		}
			
		
		public void clickImagesbox()
		{
			imagebutton.click();
		}
		
		public void clickpost() throws InterruptedException
		{
			
			if(post_button.isDisplayed())
			{
				post_button.click();
			}
			else
			{
				  JavascriptExecutor js = (JavascriptExecutor) ldriver;
				  js.executeScript("window.scrollBy(0,30)", "");
				  post_button.click();
				 				  	 
			}
		}
		
		public void scroller()
		{
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("window.scrollBy(0,90)", "");
		}
		
		public void clickCommunity()
		{
			community.click();
		}
		
		public void clickPagestab()
		{
			pagestab.click();
		}
		
		public void clickhttps()
		{
			https_protocol.sendKeys("https://code.premierinc.com/issues/browse/PC-3736");
		}
		
		public void clickhttp()
		{
			https_protocol.sendKeys("http://www.umsl.edu/~siegelj/newcourse/part1");
		}
		
		public void clicksameurl()
		{
			sameurl_protocol.sendKeys("https://collaborationdevi.premierinc.com/community/7761d5ac-0dca-4bbd-be80-88b1e53a59e4/discussion");
		}
		
		public void click_text_http_protocol()
		{
			text_http_protocol.sendKeys("testing the http protocol: http://www.umsl.edu/~siegelj/newcourse/part1");
		}
		
		public void click_text_https_protocol()
		{
			text_https_protocol.sendKeys("testing the https protocol: https://code.premierinc.com/issues/browse/PC-3736");
		}
		
		public void click_multipleurl_protocol()
		{
			multipleurl_protocol.sendKeys("https://www.google.com & https://www.facebook.com & https://www.rediff.com/");
		}
		
		public void click_text_multipleurl_protocol()
		{
			text_multipleurl_protocol.sendKeys("url: https://www.google.com & https://www.facebook.com & https://www.rediff.com/");
		}
		
		public void click_ftp_protocol()
		{
			ftp_protocol.sendKeys("ftp://internet.address.edu/file/path/file.txt");
		}

}
