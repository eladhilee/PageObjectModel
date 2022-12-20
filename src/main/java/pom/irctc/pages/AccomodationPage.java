package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers  {
	
	public AccomodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public AccomodationPage ClickOnSidebar()
	{
		clickByXpath("//a[contains(@id,'sidebarCollapse')]");
		return new AccomodationPage(driver,test);
		
	}
	public CharterPage ClickOnCharter()
	{
		clickByXpath("//a[contains(text(),'Charter')]");
		return  new CharterPage(driver,test);
		
	}
	/*
	public CharterPage ClickOnEnquiryForm()
	{
		clickByXpath("//a[contains(text(),'Enquiry Form')]");
		return  new CharterPage();
		
	}
	*/

	public HotelIrctcTourismPage ClickOnHotel()
	{
		//clickByXpath("//*[starts-with(@class,'Nav-icons IRCTCHotels')]//following::span[text()='Hotels']");
		//clickByXpath("//div[@class='container lounge-iconstop-container']//li[1]//a[1]");
		clickByXpath("//a[contains(text(),' Hotels')]");
		return  new HotelIrctcTourismPage(driver, test);
	}
	public void switchToLastWindow()
	{
		switchToLastWindow();
		}
		
}
