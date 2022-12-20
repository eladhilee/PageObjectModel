package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccomodationPage;
import pom.irctc.pages.CharterPage;
import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers  {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To Verify the Irctc.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	@Test
public void charterPage() {
	

	 new CovidAlertPage(driver, test).clickOnOk();
	new HomePage(driver, test).mouseHOverHolidays()
	                     .mouseHOverOnStays()
	                       .clickOnLounge();
	new HomePage(driver, test).switchToWindow();
	new AccomodationPage(driver, test).ClickOnSidebar()
	                      .ClickOnCharter();
	new CharterPage(driver, test). ClickOnEnquiryFrom()
	.enterName("elavenil")
	.enterOrganisation("nielit")
	.enterChAddress("nellai")
	.enterChMobile("96599446")
	.enterChEmail("eladhilee@gmail.com")
	.clickChRequestFor()
	.clickChRequestForOption()
	.enterChOrgStation("thirunelveli")
	.enterChDesStation("chennai")
	.clickChDepatDate()
	.clickChRequestForOption()
	.clickBackDate()
	.clickBackDateOption()
	.enterChDuration("19")
	.enterChCoach("8")
	.enterChNoPassenger("20")
	.enterChNoPassenger1("25")
	.enterChPurpose("vocation")
	.enterChService("leave")	
	.clickButton()

	.verifyOnMobileno("99998888");
	
}
}


