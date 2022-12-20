package wrappers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;


public class ProjectWrappers extends GenericWrappers{
	public String browserName;
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		  startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		//reserved
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {

		startTest(testCaseName, testCaseDescription);
		
		switch(appName) {
		case "facebook":
			invokeApp(browserName,"https://www.facebook.com");
			break;
		case "irctc":
			invokeApp(browserName,"https://www.irctc.co.in/nget/train-search");
			break;
		case "phpRegPage":
			invokeApp(browserName,"https://www.phptravels.org/register.php");
			break;
		case "FtrNewUserPage":
			invokeApp(browserName,"https://www.ftr.irctc.co.in/ftr/");
			break;
		case "sms":
			invokeApp(browserName,"http://uat.tecxed-sms.com/login");
			break;
		case "sms1":
			invokeApp(browserName,"http://test.tecxed-sms.com/login");
			break;
        default:
        	System.err.println("invalid application");
        	break; 
			
		
		}
		
		
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
		
	}
	@AfterClass
	public void afterClass() {
		endTest();
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
		
	}

}
