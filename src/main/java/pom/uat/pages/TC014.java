package pom.uat.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC014 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC014";
		testCaseDescription="To Verify the SMS Singin with Warehouse";
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
        new Warehouse(driver, test)
	   .mouseHOverWarehouse()
	   .mouseHOverWarehouseMgmt()
	   .clickMaterial();
	   
	}
}
