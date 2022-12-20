package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class HomePage extends GenericWrappers {
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	public RegistrationPage clickOnRegistration()
	{
		clickByXpath("//a[contains(text(),' REGISTER ')]");
		return  new RegistrationPage(driver,test);
		
	}

	
	public HomePage mouseHOverHolidays()
	{
		
		
		mouseHoverByXpath("//a[text()=' HOLIDAYS ']");
		
		
		return new HomePage(driver,test);
		
	}
	
	public HomePage mouseHOverOnStays()
	{
		mouseHoverByXpath("//span[text()='Stays']");
		return this;
		
	}
	public AccomodationPage clickOnLounge()
	{

		
		mouseHoverByXpath("//span[text()='Lounge']");
		return new AccomodationPage(driver,test);
	}
	public AccomodationPage switchToWindow()

	{
		
		switchToLastWindow();
		return new AccomodationPage(driver,test);
		
		
	}
		
	}
	

	


