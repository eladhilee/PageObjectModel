package pom.uat.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;


public class TC011 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To Verify the SMS Singin with AddUser.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="sms";
		
		           
	}
	
	@Test
           public void adduserPage(){
	     new SigninPage(driver, test)
	   .enterUserName("superadmin@tecxed.com")
	   .enterPassword("123")
	   .enterPin("123")
	   .clickOnSignIn();
	 	new AdduserPage(driver, test).mouseHOverUser().mouseHOverUserMaster().clickAddUser()
             .clickAddUserButton()
             .selectOnCompany("Tecxed Pvt Ltd (Company)")
             .selectOnCompany1("Tecxed Pvt Ltd (Company)")
             .selectOnBranch("Tecxed Test")
             .selectOnDepartment("Support")
             .enterFirstName("elavenil")
             .enterMiddleName("vj")
             .enterLastName("selenium")
             .enteruserName1("cucumber")
             .enterEmail("eladhilee@gmail.com")
             .enterNationalId("AS345DS")
             .enterContact("9876567876")
             .selectOnDisabled("Yes")
             .clickSave();
	   
	 
	                    
}

}
