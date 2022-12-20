package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcPassengerDetailsPage extends GenericWrappers {
	
	public IrctcPassengerDetailsPage clickGuestUserLogin()
	{
		clickByXpath("//a[@id='profile-tab' and text()='Guest User Login ']");
		return new IrctcPassengerDetailsPage();
	}
	public IrctcPassengerDetailsPage enterYourEmail(String Email)
	{
		enterByXpath("//input[@name='email' and @placeholder='Enter Email']", Email);
		return this;
	}
	
	public IrctcPassengerDetailsPage enterYourMobileNo(String MobileNo)
	{
		enterByXpath("//input[@name='mobileNo' and @placeholder='Enter Mobile Number']", MobileNo);
		return this;
	}
	///check.........
	public IrctcPassengerDetailsPage clickOnSignIn()
	{
		clickByXpath("//button[@class='btn btn-md btn-primary btn-radius yellow-gradient' and text()='Login']/preceding::form");
		return this;
	}
	
	public IrctcPassengerDetailsPage clickTitle()
	{
		
		clickByXpath("//select[@name='title']");
		return this;
		
	}
	public IrctcPassengerDetailsPage selectOnTitleOption(String title)
	{
		selectVisibileTextByXpath("//select[@name='title']/option[text()='Miss']",title);
		
		return this;
		
	}
	public IrctcPassengerDetailsPage enterPassFirstName(String FirstName)
	{
		enterByXpath("//input[@name='firstName']", FirstName);
		return new IrctcPassengerDetailsPage();
	}
	public IrctcPassengerDetailsPage enterPassLastName(String LastName)
	{
		enterByXpath("//input[@name='lastName']", LastName);
		return this;
	}
	
	public IrctcPassengerDetailsPage selectOnPassCountryOption(String conutry) 
	{
		selectVisibileTextByXpath("//select[@name='country']/option[text()='India']",conutry);
		
		return this;
		
	}
	
	public IrctcPassengerDetailsPage selectOnPassStateOption(String state)
	{
		selectVisibileTextByXpath("//select[@name='state']/option[text()='TAMIL NADU']",state);
	
		return this;
		
	}
	
	public IrctcPassengerDetailsPage enterPassMobileNo(String mobileNo)
	{
		enterByXpath("//input[@name='mobileNo' and @placeholder='Mobile Number']", mobileNo);
		return this;
	}
	
	public IrctcPassengerDetailsPage enterPassEmail(String email)
	{
		enterByXpath("//input[@name='email' and @placeholder='Email Id']", email);
		return this;
	}
	//check
	public IrctcPassengerDetailsPage enterPassGst(String gst)
	{
		enterByXpath("//select[@name='gst']",gst);
		return this;
		
	}
	
	//check
	public IrctcPassengerDetailsPage selectOnPassGstYesOption(String gst)
	{
		selectVisibileTextByXpath("//select[@name='gst']/option[text()='Yes']",gst);
		
		return this;
		
	}
	
	public IrctcPassengerDetailsPage entergstNumber(String gstno)
	{
		enterByXpath("//input[@name='gstNumber']", gstno);
		return this;
	}
	
	public IrctcPassengerDetailsPage enterCompanyName(String companyName)
	{
		enterByXpath("//input[@name='companyName']", companyName);
		return this;
	}
	public IrctcPassengerDetailsPage enterCompanyAddress(String companyAddress)
	{
		enterByXpath("//input[@name='companyAddress']", companyAddress);
		return this;
	}
	public IrctcSummaryPage clickOnGo() 
	{
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		return new IrctcSummaryPage() ;
		
	}
	//verify
	public IrctcPassengerDetailsPage verifyOnTextGSt(String OTPIsRequired)
	{
		
		verifyTextByXpath("//span[text()='Please Enter Valid GSt number']",OTPIsRequired);
		return this;
		
	}
	public void switchToLastWindow()
	{
		switchToLastWindow();
		
	}
	

}
