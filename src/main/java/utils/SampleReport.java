package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class SampleReport {
	@Test
	public void report() {
		
		ExtentReports reports = new ExtentReports("./reports/Results.html",false);

		ExtentTest test = reports.startTest("TC001","To verify the user can create account");
		
		test.log(LogStatus.PASS,"Appliaction run with the given url successfully");
		test.log(LogStatus.PASS,"Appliaction run with the given url successfully");
		test.log(LogStatus.PASS,"Appliaction run with the given url successfully");
		test.log(LogStatus.PASS,"Appliaction run with the given url successfully");
		test.log(LogStatus.PASS,"Appliaction run with the given url successfully");
		
		reports.endTest(test);
		reports.flush();
		
		
		
		
		
		
	}

}
