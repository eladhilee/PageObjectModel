package pom.phptravles.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpRegPage extends GenericWrappers {
	public PhpRegPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		}
	
	
	public PhpRegPage enterFirstNamee(String firstname)
	{
		
		enterByXpath("//input[@id='inputFirstName']", firstname);
		return this;
	}
	public PhpRegPage enterLastNamee(String lastname)
	{
		
		enterByXpath("//input[@id='inputLastName']", lastname);
		return this;
	}
	public PhpRegPage enterEmailID(String emailid)
	{
		
		enterByXpath("//input[@id='inputEmail']", emailid);
		return this;
	}
    public PhpRegPage enterPhoneNumber(String phone)
	{
		
		enterByXpath("//input[@id='inputPhone']", phone);
		return this;
	}
	public PhpRegPage enterCompanyName(String companyname)
	{
		
		enterByXpath("//input[@id='inputCompanyName']", companyname);
	  return this;
	}
	
	
	public PhpRegPage enterStreetAddress(String street)
	{
		
		enterByXpath("//input[@id='inputAddress1']", street);
		return  this;
	}
  public PhpRegPage enterStreetAddress2(String street1)
	{
		
		enterByXpath("//input[@id='inputAddress2']", street1);
		return this;
	}
	public PhpRegPage entercity(String city)
	{
		
		enterByXpath("//input[@id='inputCity']", city);
		return this;
	}
	
	
	public PhpRegPage enterState(String state)
	{
		
		enterByXpath("//input[@id='stateinput']", state);
		return this;
	}
	public PhpRegPage enterPostcode(String postcode)
	{
		
		enterByXpath("//input[@id='inputPostcode']", postcode);
		return this;
	}
	//check
	
	public PhpRegPage selectOnCountryOption(String inputCountry)
	{
		selectValueByXpath("//select[@id='inputCountry']/child::option[105]",inputCountry);
		
	
		return this;
	}
	
	public PhpRegPage clickCustom()
	{
		
		clickByXpath("//*[@id='customfield1']");
		return this;
	}
	public PhpRegPage selectOnCustomOption(String customfield1)
	{
		selectValueByXpath("//select[@id='customfield1']/option[text()='Google']",customfield1);
		
		
		return this;
	}
	public PhpRegPage enterMobile(String mobile)
	{
		
		enterByXpath("//input[@id='customfield2']", mobile);
		return this;
		
	}
	public PhpRegPage enterPassword(String password)
	{
		
		enterByXpath("//input[@id='inputNewPassword1']", password);
		return this;
	
	}
	public PhpRegPage enterPasswordCnfirm(String confirmpw)
	{
		
		enterByXpath("//input[@id='inputNewPassword2']", confirmpw);
		return this;
	}
	
	public PhpRegPage enterGenerte(String password)
	{
		
		enterByXpath("//button[@class='btn btn-default btn-sm btn-xs-block generate-password']", password);
		return this;
	}
	
	
	
	
	
}
