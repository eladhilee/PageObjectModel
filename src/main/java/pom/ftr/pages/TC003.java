package pom.ftr.pages;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ftr.pages.FtrNewUserPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To Verify the phpFtrNewUserPageRegPage.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="FtrNewUserPage";
		
		           
	}
	@Test
public void ftrPage(){

new FtrNewUserPage(driver, test)
	. ClickOnOk()
	                     
	.enterUserId("test")
	.enterPassword1("test@12")
	.enterPassword1("test@12")
	.selectOnSecurityQuestionOption("What is your pet name?")
	.enterSecurityAns("testng")
	.clickDateOb()
	.clickOnGender()
	.clickOnMaterialStatus()
	.enterEmailid("test123@gmail.com")
	.selectOccupationOption("Public")
	.enterFirstNam("junit")
	.enterMiddleNam("testng")
	.enterLastNam("cucmber")
	.selectOnNationalityOption("Indian")
	.enterBlockNo("58")
	.enterStreet("middle")
	.enterArea("vannerpettai")
	.selectOnCountryOption("India")
	.enterMobileNumber("9976588337")
	.enterPincode("672001");


}
}
