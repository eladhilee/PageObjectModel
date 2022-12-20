package pom.uat.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class SigninPage extends GenericWrappers {
	public SigninPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
	
	public SigninPage enterUserName(String username )
	{
		
		enterByXpath("//input[@name='username']",username);
		return this;
		
	}
	public SigninPage enterPassword(String password )
	{
		
		enterByXpath("//input[@name='password']",password);
		return this;
		
	}
	public SigninPage enterPin(String pin )
	{
		
		enterByXpath("//input[@name='code']",pin);
		return this;
		
	}
	
	
		public AdduserPage clickOnSignIn() {
			
			clickByXpath("//button[text()='Sign in']");
			//clickByXpath("//button[@type='submit']");
			return new AdduserPage(driver,test);
		}
		
		
		public SigninPage waitTime() {
			
			implicitWait();
			
			return this;
			
		}

		

}
