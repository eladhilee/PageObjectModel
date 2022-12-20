package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcPassengerDetailsNoPage extends GenericWrappers {
	
	public IrctcPassengerDetailsNoPage clickGuestUserLogin()
	{
		clickByXpath("//a[@id='profile-tab' and text()='Guest User Login ']");
		return new IrctcPassengerDetailsNoPage();
	}
	public IrctcPassengerDetailsNoPage enterYourEmail(String email)
	{
		enterByXpath("//input[@name='email' and @placeholder='Enter Email']", email);
		return this;
	}
	
	public IrctcPassengerDetailsNoPage enterYourMobileNo(String mobileno)
	{
		enterByXpath("//input[@name='mobileNo' and @placeholder='Enter Mobile Number']", mobileno);
		return this;
	}
	public IrctcPassengerDetailsNoPage clickSignIn1()
	{
		clickByXpath("//button[@class='btn btn-md btn-primary btn-radius yellow-gradient' and @type='submit']");
		return this;
	}
	
	public IrctcPassengerDetailsNoPage clickTitle()
	{
		
		clickByXpath("//select[@name='title']");
		return this;
		
	}
	public IrctcPassengerDetailsNoPage selectOnTitleOption(String title)
	{
		selectVisibileTextByXpath("//select[@name='title']/option[text()='Miss']",title);
		
		return this;
		
	}
	public IrctcPassengerDetailsNoPage enterPassFirstName(String firstName)
	{
		
		enterByXpath("//input[@name='firstName']", firstName);
		return this;
	}
	public IrctcPassengerDetailsNoPage enterPassLastName(String lastName)
	{
		enterByXpath("//input[@name='lastName']", lastName);
		return this;
	}
	
	public IrctcPassengerDetailsNoPage selectOnPassCountryOption(String conutry) 
	{
		selectVisibileTextByXpath("//select[@name='country']/option[text()='India']",conutry);
		
		return this;
		
	}
	
	public IrctcPassengerDetailsNoPage selectOnPassStateOption(String state)
	{
		selectVisibileTextByXpath("//select[@name='state']/option[text()='TAMIL NADU']",state);
		
		return this;
		
	}
	
	public IrctcPassengerDetailsNoPage enterPassMobileNo(String mobileNo)
	{
		
		enterByXpath("//input[@name='mobileNo' and @placeholder='Mobile Number']", mobileNo);
		return this;
	}
	
	public IrctcPassengerDetailsNoPage enterPassEmail(String email)
	{
		enterByXpath("//input[@name='email' and @placeholder='Email Id']", email);
		return this;
	}
	
	
	public IrctcPassengerDetailsNoPage enterPassGst(String gst)
	{
		enterByXpath("//select[@name='gst']",gst);
		return this;
		
	}
	//check
	public IrctcPassengerDetailsNoPage selectOnPassGstNoOption(String gst)
	{
		selectVisibileTextByXpath("//select[@name='gst']/option[text()='No']",gst);
		
		return this;
		
	}

	public IrctcPassengerDetailsNoPage verifyOnhotelname(String Hotelname)
	{
		
		verifyTextByXpath("//div[@class='mid-searchpack']/child::h5[1]",Hotelname);
		return this;
		
	}
	public IrctcPassengerDetailsNoPage verifyOnhotelamount(String Amount)
	{
		
		verifyTextByXpath("//strong[text()='₹ 14107.52']",Amount);
		return this;
		
	}
   public IrctcSummaryPage clickOnGo()
   {
	  clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
	   return new IrctcSummaryPage();
					
   }

}
