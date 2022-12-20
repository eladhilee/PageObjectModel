package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelIrctcTourismPage extends GenericWrappers {
		
	public HotelIrctcTourismPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
		public HotelIrctcTourismPage enterDestination(String Chennai)
		{
			//enterByXpath("//input[@placeholder='Enter City or Hotel Name']", Chennai);
			enterByXpath("//input[@id='filterText']",Chennai);
			return new HotelIrctcTourismPage(driver,test);
		}
		public HotelIrctcTourismPage clickDestination()
		{
			//clickByXpath("//input[@placeholder='Enter City or Hotel Name']");
			clickByXpath("//label[normalize-space()='Tamil Nadu']");
			return this;
		}
		
		
		//check
		public HotelIrctcTourismPage clickCheckInDate()
		{
			
			clickByXpath("//input[@name='dt12']");
			return this;
		}
		public HotelIrctcTourismPage clickCheckInDateOption()
		{
			clickByXpath("//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-selected' and text()='28']");
			return this;
		}
		//chceck
		public HotelIrctcTourismPage clickCheckOutDate()
		{
			
			clickByXpath("//input[@name='dt13']" );
			return this;
		}
		public HotelIrctcTourismPage clickCheckOutDateOption()
		{
			
			clickByXpath("//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-selected' and text()='31']");
			return this;
		}
		
		public HotelIrctcTourismPage clickRoomsGuest()
		{
			clickByXpath("//input[@id='user-data-wrapper-id']");
			return  this;
		}

		public HotelIrctcTourismPage selectOnNORooms(String hotelroom)
		{
			selectValueByXpath("//select[@name='hotelRoom']/option[text()='1']",hotelroom);
			
			return  this;
		}
		
		
		public HotelIrctcTourismPage selectOnAdultGuestOption(String adult)
		{
			
			selectValueByXpath("//select[@name='hotelAdult']/option[text()='2']",adult);
		
			return  this;
		}
		
		public HotelIrctcTourismPage selectOnChildGuestOption(String child)
		{
			selectValueByXpath("//select[@name='hotelChild']/option[text()='3']",child);
			
			return  this;
		}
		
		/*public HotelIrctcTourismPage selectOnChildAge1Option(String Child1)
		{
			selectValueByXpath("//select[@class='browser-default ng-pristine ng-valid ng-touched']/option[text()='1']",Child1);
			
			return  this;
		}*/
		public HotelIrctcTourismPage clickDoneOption()
		{
			clickByXpath("//button[text()='Done']");
			return  this;
		}
//check
		public HotelTourismSearchPage clickOnFindHotel()
		{
			clickByXpath("//button[@class='btn btn-md yellow-gradient home-btn']");
			return  new HotelTourismSearchPage();
			
		}
		
		public void switchToLastWindow()
		{
			switchToLastWindow();
			
		}
		}
		
		

	



