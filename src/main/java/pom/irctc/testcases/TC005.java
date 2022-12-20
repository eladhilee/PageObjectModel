package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005  extends ProjectWrappers {


	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To Verify the Irctc.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
		
	@Test
		public void registrationPage() {
	 new CovidAlertPage(driver, test).clickOnOk()
	                     
	                    . clickOnRegistration()
	                    .enterUserName("elavenil")
	                    .enterPassWord("Elavenil@58")
	                    .enterConfirmPassWord("Elavenil@58")
	                    .clickPreferredLanguageOption()
	                    .clickPreferredLanguage()
	                    .clickSecurityQuestion()
	                    .clickSecurityQuestionOption()
	                    .enterSecurityAnswer("")
	                    .clickOnContinue()
	                    .enterFirstName("elavenil")
	                    .enterMiddleName("dhileeban")
	                    .enterLastName("ganesan")
	                    .clickOccupation()
	                    .clickOccupationOption()
	                    .clickDob()
	                    .selectOnDobMonth("June" )
	                    .selectOnDobYear("1899")
	                    .clickMarried()
	                    .selectOnCountryOption("india")
	                    .clickMarried()
	                    .enterEmail("eladhilee@gmail.com")
	                    .enterMobileNumber("9659944687")
	                   .selectOnNationalityOption("india")
	                    .clickOnContinue1()
	                    .enterFlatNumber("58")
	                    .enterStreet("middle street")
	                    .enterArea("saravanas icecream")
	                    .enterPincode("")
	                    .enterState("627001")
	                    .selectOnCity("thirunelveli")
	                    .selectOnPostoffice("thirunelveli")
	                    .enterPhoneNo("9976588337")
	                    . clickOffAddNo()
	                    .enterBloclNo("57")
	                    .enterLane("6")
	                    .enterLocality("tvl")
	                    .clickOnRegCountryOption()
	                    .enterRegPin("627001")
	                    .enterRegState("Tamilnadu")
	                    .selectRegCity("Thirunelveli")
	                    .selectRegPostOff("Thirunelveli")
	                    .enterRegPhone("9659944687")
	                    .clickSbi()
	                    .clickTermcondition();


}


}
