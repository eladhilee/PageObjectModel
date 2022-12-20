package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	

	
		public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
			this.test=test;
	}
		public RegistrationPage enterUserName(String userName)
		{
			enterByXpath("//input[@name='userName']", userName);
			return new RegistrationPage(driver,test);
		}
		public RegistrationPage enterPassWord(String usrPwd)
		{
			
			enterByXpath("//input[@name='usrPwd']", usrPwd);
			return this;
		}
		public RegistrationPage enterConfirmPassWord(String cnfUsrPwd)
		{
			
			enterByXpath("//input[@name='cnfUsrPwd']", cnfUsrPwd);
			return this;
		}
		
		
		
		//check
		public RegistrationPage clickPreferredLanguage()
		{
			clickByXpath("//*[text()='Preferred Language']");
			//clickByXpath("//*[@class='ng-tns-c66-14 ui-dropdown ui-widget ui-state-default ui-corner-all']");
			return this;
		}
		public RegistrationPage clickPreferredLanguageOption()
		{
			clickByXpath("//*[text()='+option+']");
			//clickByXpath("//p-dropdown//div[@class='ui-helper-hidden-accessible ng-tns-c66-14']");
			return this;
		}
		//check
		public RegistrationPage clickSecurityQuestion()
		{
			
			//clickByXpath("//*[text()='Security Question']");
			clickByXpath("//*[@class='ng-tns-c66-15 ui-dropdown ui-widget ui-state-default ui-corner-all']");
			return this;
		}
		//check
		public RegistrationPage clickSecurityQuestionOption()
		{
			String data="veni";
			//clickByXpath("//*[text()='+option+']");
			clickByXpath("//*[@class='ui-helper-hidden-accessible ng-tns-c66-15']");

			return this;
		}
		public RegistrationPage enterSecurityAnswer(String SecurityAnswer )
		{
			enterByXpath("//input[@formcontrolname='secAns']", SecurityAnswer);
			return this;
		}
		//check
		public RegistrationPage clickOnContinue()
		{
			clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
			return  this;
			
		}
		public RegistrationPage enterFirstName(String firstName)
		{
			enterByXpath("//input[@name='firstName']", firstName);
			return  this;
		}
		public RegistrationPage enterMiddleName(String middleName)
		{
			
			enterByXpath("//input[@name='middleName']", middleName);
			return this;
		}
		public RegistrationPage enterLastName(String lastname)
		{
			enterByXpath("//input[@name='lastname']", lastname);
			return this;
		}
		
		//check
		public RegistrationPage clickOccupation()
		{
			//clickByXpath("//span[text()='Select Occupation']");
			clickByXpath("//div[@class='ng-tns-c66-16 ui-dropdown ui-widget ui-state-default ui-corner-all']");
			return this;
		}
		public RegistrationPage clickOccupationOption()
		{
			//clickByXpath("//span[text()='GOVERNMENT']");
			clickByXpath("//div[@class='ui-helper-hidden-accessible ng-tns-c66-16']");
			return this;
		}
		//check update table
		public RegistrationPage clickDob()
		{
			clickByXpath("//a[text()='4']");
			return this;
		}
		
		public RegistrationPage selectOnDobMonth(String month )
		{
			
			selectValueByXpath("//select[@class='ui-datepicker-month ng-tns-c59-17 ng-star-inserted']/option[text()='June']",month);
			
			return this;
		}
		
		public RegistrationPage selectOnDobYear(String year )
		{
			
			selectValueByXpath("//select[@class='ui-datepicker-year ng-tns-c59-17 ng-star-inserted']/option[text()='1899']",year);
			
			return this;
		}
		public RegistrationPage clickMarried()
		{
			
			clickByXpath("//label[text()='Married']");
		    return this;
		}
		
		
		//check
		
		
		public RegistrationPage selectOnCountryOption(String india)
		{
			
			selectValueByXpath("//select[@formcontrolname='resCountry']/option[text()='India']",india);
			
			return this;
		}
		//check
		public RegistrationPage clickGender()
		{
			clickByXpath("//span[text()='Female']");
			return this;
		}
		public RegistrationPage enterEmail(String email)
		{
			enterByXpath("//input[@name='email']", email);
			return this;
		}
		public RegistrationPage enterMobileNumber(String mobile)
		{
		
			enterByXpath("//input[@name='mobile']", mobile);
			return this;
		}
		
		public RegistrationPage selectOnNationalityOption(String nationality )
		{
			
			selectValueByXpath("//select[@formcontrolname='nationality']/option[text()='India']",nationality);
			
			return this;
		}
		public RegistrationPage clickOnContinue1()
		{
			clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
			return  this;
			
		}
		public RegistrationPage enterFlatNumber(String resAddress1)
		{
			
			enterByXpath("//input[@name='resAddress1']", resAddress1);
			return this;
		}
		public RegistrationPage enterStreet(String resAddress2)
		{
			enterByXpath("//input[@name='resAddress2']", resAddress2);
			return this;
		}
		public RegistrationPage enterArea(String resAddress3)
		{
			enterByXpath("//input[@name='resAddress3']", resAddress3);
			return this;
		}
		public RegistrationPage enterPincode(String resPinCode)
		{
			
			enterByXpath("//input[@name='resPinCode']", resPinCode);
			return this;
		}
		public RegistrationPage enterState(String resState)
		{
			enterByXpath("//input[@name='resState']", resState);
			return this;
		}
		public RegistrationPage selectOnCity(String resCity)
		{
			
			selectVisibileTextByXpath("//select[@formcontrolname='resCity']/option[text()='Select city']", resCity);
			
			return this;
		}
		public RegistrationPage selectOnPostoffice(String resPostOff)
		{
			selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']/option[text()='Select a Post Office']", resPostOff);
			
			return this;
		}
		
		
		public RegistrationPage enterPhoneNo(String resPhone)
		{
			enterByXpath("//input[@id='resPhone']", resPhone);
			return this;
		}
		
		public RegistrationPage clickOffAddNo()
		{
			clickByXpath("//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on']");
			return this;
		}
		public RegistrationPage enterBloclNo(String offAddress1)
		{
			enterByXpath("//input[@id='offAddress1']", offAddress1);
			return this;
		}
		
		public RegistrationPage enterLane(String offAddress2)
		{
			enterByXpath("//input[@id='offAddress2']", offAddress2);
			return this;
		}
		public RegistrationPage enterLocality(String offAddress3)
		{
			enterByXpath("//input[@id='offAddress3']", offAddress3);
			return this;
		}
		
		
		public RegistrationPage clickOnRegCountryOption()
		{
			clickByXpath("//*[@class='ng-tns-c66-18 ui-dropdown ui-widget ui-state-default ui-corner-all']");
			return this;
		}
		public RegistrationPage enterRegPin(String offPinCode)
		{
			enterByXpath("//input[@id='offPinCode']", offPinCode);
			return this;
		}
		public RegistrationPage enterRegState(String offState)
		{
			enterByXpath("//input[@id='offState']", offState);
			return this;
		}
		public RegistrationPage selectRegCity(String offCity)
		{
			selectVisibileTextByXpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']/option[text()='Select city']", offCity);
			
			return this;
		}
		public RegistrationPage selectRegPostOff(String offPostOff)
		{
			selectVisibileTextByXpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']/option[text()='Select a Post Office']", offPostOff);
			
			return this;
		}
		public RegistrationPage enterRegPhone(String offPhone)
		{
			
			enterByXpath("//input[@id='offPhone']", offPhone);
			return this;
		}
		public RegistrationPage clickSbi()
		{
			
			clickByXpath("//input[@id='sbi']");
			return this;
		}
		public RegistrationPage clickTermcondition()
		{
			
			clickByXpath("//input[@formcontrolname='termCondition']");
			return this;
		}
		
	
	}

	


