package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelTourismSearchPageNo extends GenericWrappers{
	
	public HotelTourismSearchPageNo enterHotelName(String HotelName)
	{
		enterByLinkText("//div[@class='mid-searchpack']/child::h5[1]",HotelName);
		return  new HotelTourismSearchPageNo();
	}
	public HotelTourismSearchPageNo getHotelName()
	
	{
		getTextByXpath("HotelName");
		
		return  this;
	}
	public HotelTourismSearchPageNo enterHotelPrice(String Fare)
	{
		enterByLinkText("//strong[text()='₹ 3149']",Fare);
		return  this;
	}
	public HotelTourismSearchPageNo getHotelPrice()
	{
		getTextByXpath("Fare");
		return  this;
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
	




