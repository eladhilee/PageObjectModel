package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookPage extends GenericWrappers {
	
	public FacebookPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
	public FacebookPage selectEnglish()
	{
		
		clickByXpath("//*[text()='English (UK)']");
		return this;
		
	}
	/*public FacebookPage enterUserName(String firstname )
	{
		
		enterByXpath("//input[(@name='firstname')]", firstname);
		return this;
		
	}*/
	
		public FacebookRegPage clickOnCreateAccount() {
			clickByXpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
			//clickByXpath("//*[@text()='Create New Account']");
			return new FacebookRegPage(driver, test);
		}
		
		
		public FacebookPage waitTime() {
			
			implicitWait();
			
			return this;
			
		}

		

	}


