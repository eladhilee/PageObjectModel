package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcSummaryPage extends GenericWrappers {
	
	public IrctcSummaryPage clickOnAgree() 
	{
		clickByXpath("//input[@id='materialUnchecked']");
		return new IrctcSummaryPage();
		
	}
	public IrctcSummaryPage clickOnMakePayment() 
	{
		clickByXpath("//button[text()='Make Payment']");
		return this;
		
	}
	public IrctcSummaryPage enterPassOtp(String otp)
	{
		enterByXpath("//input[@name='otp' and @placeholder='OTP']", otp);
		return this;
	}
	public IrctcSummaryPage clickOnVerify()
	{
		
		clickByXpath("//button[text()='Verify']");
		return this;
		
	}
	public IrctcSummaryPage verifyOnOTPFieldIsRequired(String otps)
	{
		
		
		verifyTextByXpath("//p[text()='OTP not valid, Please try again.']", otps);
		return new IrctcSummaryPage();
		
	}

	
	

}
