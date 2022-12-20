package pom.uat.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC013 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To Verify the SMS Singin with Vendor";
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
             
              new Vendor(driver, test)
              .waitTime()
             .mouseHOveVendorMgmt()
             .waitTime()
             .clickVendorType();
             
             
             
	   
	 
	                    
}


}
