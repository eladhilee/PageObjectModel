package pom.ftr.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegPage extends GenericWrappers {
	public FtrRegPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
	
	public FtrRegPage enterUserId(String userid)
	{
		enterByXpath("//input[@id='userId']", userid);
		return new FtrRegPage(driver, test);
	}
	public FtrRegPage enterPassword1(String password)
	{
		
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	public FtrRegPage enterConfirmPassword(String password)
	{
		
		enterByXpath("//input[@id='cnfPassword']", password);
		return this;
	}
	
   
    public FtrRegPage selectOnSecurityQuestionOption(String secQstn)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='secQstn']/option [text()='What is your pet name?']",secQstn);
    	
   		return this;
   	}
	public FtrRegPage enterSecurityAns(String test)
	{
		
		enterByXpath("//input[@id='secAnswer']", test);
	  return this;
	}
	
	//check table method
	public FtrRegPage clickDateOb()
	{
				
	//	clickDatePicker("//input[@id='dateOfBirth']");
		return  this;
	}
  public FtrRegPage clickOnGender()
	{
		
		clickByXpath("//label[text()='Female']");
	
		return this;
	}
	public FtrRegPage clickOnMaterialStatus()
	{
		
		clickById("//label[text()='Married']/following-sibling::input");
		return this;
	}
	
	
	public FtrRegPage enterEmailid(String email)
	{
		
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	
	public FtrRegPage selectOccupationOption(String occupation)
	{
		selectVisibileTextByXpath("//select[@id='occupation']/option [text()='Government']",occupation);
		
   		return this;
   	}
	public FtrRegPage enterFirstNam(String firstname)
	{
		
		enterByXpath("//input[@id='fname']", firstname);
		return this;
	}
	public FtrRegPage enterMiddleNam(String midname)
	{
		enterByXpath("//input[@id='mname']", midname);
		return this;
	}
	public FtrRegPage enterLastNam(String lastname)
	{
		
		enterByXpath("//input[@id='lname']", lastname);
		return this;
	}
	
    public FtrRegPage selectOnNationalityOption(String natinality )
   	{
   		
    	selectVisibileTextByXpath("//select[@id='natinality']/option [text()='Indian']",natinality);
    	
   		return this;
   	}
	public FtrRegPage enterBlockNo(String blockno)
	{
		
		enterByXpath("//input[@id='flatNo']", blockno);
		return this;
	}
	public FtrRegPage enterStreet(String street)
	{
		
		enterByXpath("//input[@id='street']", street);
		return this;
	}
	
	public FtrRegPage enterArea(String address)
	{
		
		enterByXpath("//input[@id='area']", address);
		return this;
	}
	
    public FtrRegPage selectOnCountryOption(String country)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='country']/option [text()='India']",country);
    	
   		return this;
   	}
    
	public FtrRegPage enterMobileNumber(String mobileno)
	{
		
		enterByXpath("//input[@id='mobile']", mobileno);
		return this;
	}
	public FtrRegPage enterPincode(String pincode)
	{
	
		enterByXpath("//input[@id='pincode']", pincode);
		return this;
	}
	
	
	
	
}
