package pom.uat.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To Verify the SMS Singin with Assign Role to User";
		author="Ela";
		category="smoke";
		browserName="chrome";
		appName="sms";
		
		           
	}
	
	@Test
           public void signinPage(){
		
		
		
             new SigninPage(driver, test)
	   .enterUserName("superadmin@tecxed.com")
	   .enterPassword("123")
	    .enterPin("123")
	   .clickOnSignIn();
             
              new AssignRoletoUser(driver, test)
             .mouseHOverUser()
             .waitTime()
             .mouseHOverRoleandPrivilege()
             .waitTime()
             .clickAssignRoletoUser()
             .waitTime()
              .clickaddUserRoleBtn()
              .waitTime()
               .selectOnCompany("Tecxed Pvt Ltd")
             .selectOnCompany1("Tecxed Pvt Ltd (Company)")
             .selectOnUser("Select Company")
             .selectOnRole("Super Admin")
             .selectOnDisabled("No")
             .clickSubmitBtn();
             
             
	   
	 
	                    
}

}
