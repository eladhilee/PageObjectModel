package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccomodationPage;
import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelIrctcTourismPage;
import pom.irctc.pages.HotelTourismDetailsPage;
import pom.irctc.pages.HotelTourismSearchPage;
import pom.irctc.pages.IrctcPassengerDetailsNoPage;
import pom.irctc.pages.IrctcSummaryPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC0010 extends ProjectWrappers{
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
		public void hotelAccomadationGstNoPage() {
			

			new CovidAlertPage(driver, test). clickOnOk();
			new HomePage(driver, test).mouseHOverHolidays()
			                     .mouseHOverOnStays()
			                     .clickOnLounge();
			new HomePage(driver, test).switchToWindow();
		
			new AccomodationPage(driver, test).ClickOnHotel();
			new HotelIrctcTourismPage(driver, test).enterDestination("chennai")
			.clickDestination()
			.clickCheckInDate()
			.clickCheckInDateOption()
			.clickCheckOutDate()
			.clickCheckOutDateOption()
			.clickRoomsGuest()
			.selectOnNORooms("4")
			.selectOnAdultGuestOption("2")
			.clickDoneOption()
			.clickOnFindHotel();
			new HotelTourismSearchPage().enterHotelName("HotelName")
			.getHotelName()
			.enterHotelPrice("Fare")
			.getHotelPrice()	
			.clickOnBook();
		
			new IrctcPassengerDetailsNoPage().clickGuestUserLogin()
			.enterYourEmail("eladhilee@gmail.com")
			.enterYourMobileNo("9659944687")
			.clickSignIn1()			
			.clickTitle()
			.selectOnTitleOption("title")
			.enterPassFirstName("elavenil")
			.enterPassLastName("ganesan")
			.selectOnPassCountryOption("India")
			 .selectOnPassStateOption("TAMILNADU")
			.enterPassMobileNo("9659944687")
			.enterPassEmail("elavenilg58@gmail.com")
			.enterPassGst("gst")
			.selectOnPassGstNoOption("No")
			.verifyOnhotelname("name")
			.verifyOnhotelamount("500")
			.clickOnGo();
			new IrctcSummaryPage().clickOnAgree() 
			.clickOnMakePayment()
			.enterPassOtp("56788")
			.clickOnVerify()
			.verifyOnOTPFieldIsRequired("OTP not valid, Please try again");
			
		
	}

	

		
	}



