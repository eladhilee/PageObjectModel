package pom.phptravles.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravles.pages.PhpRegPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Verify the phpRegPage.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="phpRegPage";
		
		           
	}
	@Test
public void phpRegPage(){

		              new PhpRegPage(driver,test)
	                  .enterFirstNamee("testng")
	                  .enterLastNamee("cucumber")
	                  .enterEmailID("test123@gmail.com")
	                  .enterPhoneNumber("9878765456")
	                  .enterCompanyName("nielit")
	                  .enterStreetAddress("58 block")
	                  .enterStreetAddress2("middle street")
	                  .entercity("nellai")
	                  .enterState("Tamilnadu")
	                  .enterPostcode("627001")
	                 . selectOnCountryOption("India")
	                  .clickCustom()
	                  .selectOnCustomOption("Google")
	                  .enterMobile("9976588337")
	                  .enterPassword("test@12")
	                  .enterPasswordCnfirm("test@12")
	                  .enterGenerte("45");
	                    
}
}