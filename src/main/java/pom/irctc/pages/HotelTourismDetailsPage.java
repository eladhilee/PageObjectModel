package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelTourismDetailsPage extends GenericWrappers {
	public IrctcPassengerDetailsPage clickOnFindContniueToBook()
	{
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']");
		return  new IrctcPassengerDetailsPage();
	}

	
}
