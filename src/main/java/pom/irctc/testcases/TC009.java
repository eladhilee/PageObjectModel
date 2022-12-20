package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccomodationPage;
import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelIrctcTourismPage;
import pom.irctc.pages.HotelTourismDetailsPage;
import pom.irctc.pages.HotelTourismSearchPage;
import pom.irctc.pages.IrctcPassengerDetailsPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers  {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To Verify the Irctc.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void hotelAccomadationPage() {
		

		new CovidAlertPage(driver, test).clickOnOk();
		new HomePage(driver, test).mouseHOverHolidays()
		                     .mouseHOverOnStays()
		                       .clickOnLounge();
		new HomePage(driver, test).switchToWindow();
		                       
		//new AccomodationPage(driver, test).ClickOnHotel();
		new AccomodationPage(driver,test).ClickOnSidebar()
        .ClickOnHotel();
	
		new HotelIrctcTourismPage(driver, test).enterDestination("Chennai")
		.clickDestination()
		.clickCheckInDate()
		.clickCheckInDateOption()
		.clickCheckOutDate()
		.clickCheckOutDateOption()
		.clickRoomsGuest()
		.selectOnNORooms("1")
		.selectOnAdultGuestOption("2")
		.selectOnChildGuestOption("2")
		
		.clickDoneOption()
		.clickOnFindHotel();
		
		new HotelTourismSearchPage().enterHotelName("HotelName")
		.getHotelName()
		.enterHotelPrice("Fare")
		.getHotelPrice()	
		.clickOnBook();
		
		new IrctcPassengerDetailsPage().clickGuestUserLogin()
		.enterYourEmail("eladhilee@gmail.com")
		.enterYourMobileNo("9659944687")
		.clickOnSignIn()
		.clickTitle()
		.selectOnTitleOption("title")
		.enterPassFirstName("elavenil")
		.enterPassLastName("ganesan")
		.selectOnPassCountryOption("India")
		 .selectOnPassStateOption("TAMILNADU")
		.enterPassMobileNo("9659944687")
		.enterPassEmail("eladhilee@gmail.com")
		.enterPassGst("gst")
		.selectOnPassGstYesOption("Yes")
		.entergstNumber("6766")
		.enterCompanyName("nielit")
		.enterCompanyAddress("sararavans icecrean")
		.clickOnGo();
		new IrctcPassengerDetailsPage().verifyOnTextGSt("Please Enter Valid GSt number");
		
	}
	
}
