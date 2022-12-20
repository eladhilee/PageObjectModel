package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelTourismSearchPage extends GenericWrappers {
	
	
	
	public HotelTourismSearchPage enterHotelName(String HotelName)
	{
		enterByLinkText("//div[@class='mid-searchpack']/child::h5[1]",HotelName);
		return  new HotelTourismSearchPage();
	}
	public HotelTourismSearchPage getHotelName()
	
	{
		getTextByXpath("HotelName");
		
		return  new HotelTourismSearchPage();
	}
	public HotelTourismSearchPage enterHotelPrice(String Fare)
	{
		enterByLinkText("//strong[text()='₹ 3149']",Fare);
		return  new HotelTourismSearchPage();
	}
	public HotelTourismSearchPage getHotelPrice()
	{
		getTextByXpath("Fare");
		return  new HotelTourismSearchPage();
	}
	public IrctcPassengerDetailsPage clickOnBook()
	{
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']");
		return  new IrctcPassengerDetailsPage();
	}
	public void switchToLastWindow()
	{
		switchToLastWindow();
		
	}
}
	

