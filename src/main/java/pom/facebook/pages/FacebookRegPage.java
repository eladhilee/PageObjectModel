package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookRegPage extends GenericWrappers {
		
	public FacebookRegPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		//this.test=test;
	}
	
	
		
		public FacebookRegPage enterFirstName(String firstname )
		{     
			
			enterByXpath("//input[(@name='firstname')]", firstname);
			return new FacebookRegPage(driver, test);
		}
		public FacebookRegPage enterLastName(String lastname) {
		
			enterByXpath("//input[@name='lastname']", lastname);
			return this;
		}
			
		public FacebookRegPage enterMobileNumber(String mobileno) {
			
			enterByXpath("//input[(@name='reg_email__')]", mobileno);
			return this;
			
		}
          public FacebookRegPage enterPassWord(String password) {
			
			enterByXpath("//input[(@name='reg_passwd__')]", password);
			return this;
			
		}
		//check
		public FacebookRegPage selectOnDDobOption(String day) {
			
			
			
			//selectVisibileTextByXpath("//select[@id='day']/child::option[30]",day);
			//selectVisibileTextByXpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])/option[5]",day);
			selectVisibileTextByXpath("//select[@id='day']",day);
			return this;
			
		}

		public FacebookRegPage selectOnMonDobOption(String month) {
			
			
			//selectVisibileTextByXpath("//select[@id='month']/child::option[7]",month);
			selectVisibileTextByXpath("//select[@id='month']",month);
	
			return this;
			
		}
		
		public FacebookRegPage SelectOnDobYearOption(String year) {
			
			selectVisibileTextByXpath("//select[@id='year']",year);
			//selectVisibileTextByXpath("//select[@id='year' and @name='birthday_year']/option[15]",year);
			
		    
			return this;
			
		}
		
		
	
		public FacebookRegPage clickGender() {
			
			//clickByXpath("//label[text()='Female']/following-sibling::input");
			clickByXpath("(//span[@class='_5k_2 _5dba'])[1]/label");
	     	return this;
			
		}
		
		
		
		
	}


