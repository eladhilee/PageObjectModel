package pom.uat.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Vendor extends GenericWrappers {
	public Vendor(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
	}
	public Vendor mouseHOverVendor()
	{
		
		
		mouseHoverByXpath("//a[@href='#'][normalize-space()='Vendor']");
		//mouseHoverByXpath("//a[contains(text(),'User ')]");
		return new Vendor(driver,test);
		
	}
	
	public Vendor mouseHOveVendorMgmt()
	{
		
		
		mouseHoverByXpath("//a[normalize-space()='Vendor Management']");
		//mouseHoverByXpath("//a[contains(text(),'User ')]");
		return this;
		
	}
	public Vendor clickVendorType()
	{
		
		
		mouseHoverByXpath("//a[normalize-space()='Vendor Type']");
		//mouseHoverByXpath("//a[text()='Vendor Management']");
		return new Vendor(driver,test);
		
	}
	
public Vendor waitTime() {
		
		implicitWait();
		
		return this;

}

}
