package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
		
		public CharterPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;
	}
		public CharterPage ClickOnEnquiryFrom()
		{
			//clickByXpath("//a[contains(text(),'Enquiry Form']");
			clickByXpath("//a[contains(text(),'Enquiry Form')]");

			return  new CharterPage(driver, test);
			
		}
		public CharterPage enterName(String name)
		{
			enterByXpath("//input[@name='name']", name);
			return this;
		}
		public CharterPage enterOrganisation(String organization)
		{
			enterByXpath("//input[@name='organization']", organization);
			return this;
		}
		public CharterPage enterChAddress(String address)
		{
			enterByXpath("//input[@name='address']", address);
			return this;
		}

		public CharterPage enterChMobile(String mobile)
		{
			enterByXpath("//input[@name='mobile']", mobile);
			return this;
		}
		public CharterPage enterChEmail(String email)
		{
			enterByXpath("//input[@name='email']", email);
			return this;
		}
		public CharterPage clickChRequestFor()
		{
			
			clickByXpath("//select[@name='requestFor']");
			return this;
		}
		public CharterPage clickChRequestForOption()
		{
			
			clickByXpath("//select[@name='requestFor']/option[text()='Saloon Charter']");
			return this;
		}
		public CharterPage enterChOrgStation(String originStation)
		{
			enterByXpath("//*[@name='originStation']", originStation);
			return this;
			}
		
		public CharterPage enterChDesStation(String destnStation)
		{
			enterByXpath("//*[@name='destnStation']", destnStation);
			return this;
		}
		//check and upadte table
		public CharterPage clickChDepatDate()
		{
			
			clickByXpath("//input[@name='checkInDate']");
			//clickByXpath("//span[@class='dimed active-red']");
			

			return this;
		}
		//check
		public CharterPage clickChDepatDateOption()
		{
			
			//clickByXpath("//span[@class='dimed' and text()='24']");
			
			clickByXpath("//span[normalize-space()='8']");
			
			return this;
		}
		public CharterPage clickBackDate()
		{
			
			clickByXpath("//input[@name='checkOutDate']");
			return this;
		}
		public CharterPage clickBackDateOption()
		{
			
			clickByXpath("//span[@class='act' and text()='26']");
			return this;
		}
		public CharterPage enterChDuration(String durationPeriod)
		{
			enterByXpath("//input[@name='durationPeriod']", durationPeriod);
			return this;
		}
		
		
		public CharterPage enterChCoach(String coachDetails)
		{
		
			enterByXpath("//input[@name='coachDetails']", coachDetails);
			return this;
		}
		public CharterPage enterChNoPassenger(String Numberofpassengers)
		{
			
			enterByXpath("//label[text()='Number of passengers']", Numberofpassengers);
			return this;
		}
		public CharterPage enterChNoPassenger1(String numPassenger)
		{
			enterByXpath("//input[@name='numPassenger']", numPassenger);
			return this;
		}
		
		
		public CharterPage enterChPurpose(String charterPurpose)
		{
			
			enterByXpath("//textarea[@name='charterPurpose']", charterPurpose);
			return this;
		}
		
		public CharterPage enterChService(String services)
		{
			
			enterByXpath("//textarea[@name='services']", services);
			return this;
		}
		
		public CharterPage clickButton()
		{
			
			clickByXpath("//button[@class='btn btn-radius-none btn-yellow' and text()='Submit ']");
			//clickByXpath("//button[normalize-space()='Submit']");
			
			return this;
		}
	 /*  public CharterPage getOnButton1()
		{
			getTextByXpath("//span[text()='Mobile no. not valid']");
			return this;
		}*/

		public CharterPage  verifyOnMobileno(String otps)
		{
			verifyTextByXpath("//span[text()='Mobile no. not valid']",otps);
			//verifyTextByXpath("//span[normalize-space()='Mobile no. not valid']",otps);
						return this;
		}
		
		
	}


