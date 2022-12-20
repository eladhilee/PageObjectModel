package pom.ftr.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrNewUserPage extends GenericWrappers {
	public FtrNewUserPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
	public FtrRegPage ClickOnOk() {
		//clickByXpath("//a[Contains(text()= 'New User? Signup']");
		clickByXpath("//a[text()='New User? Signup']");
		
		return new FtrRegPage(driver, test);
	}

}
