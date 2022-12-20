package pom.facebook.pages;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To Verify the Facebook Signup.";
		author="Ela";
		category="smoke";
		browserName="chrome";
		
		appName="facebook";
		
		           
	}
	
	@Test
           public void facebookPage(){
	     new FacebookPage(driver, test)
	   .selectEnglish()
	   .clickOnCreateAccount()
	   .enterFirstName("elavenil")
	 .enterLastName("ganesan")
     .enterMobileNumber("9659944687")
     .enterPassWord("test@12")
    .selectOnDDobOption("30")
    .selectOnMonDobOption("Jun")
    .SelectOnDobYearOption("2007")
     .clickGender();
	                    
}
}
