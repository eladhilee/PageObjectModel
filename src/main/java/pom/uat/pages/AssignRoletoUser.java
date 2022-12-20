package pom.uat.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public  class AssignRoletoUser extends GenericWrappers {
	public AssignRoletoUser(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
	}
	public AssignRoletoUser mouseHOverUser()
	{
		
		
		mouseHoverByXpath("//body/div[@class='layout-wrapper']/div[@class='content-wrapper']/div[@class='horizontal-navigation']/ul/li[3]/a[1]");
		//mouseHoverByXpath("//a[contains(text(),'User ')]");
		return new AssignRoletoUser(driver,test);
		
	}
	
	
public AssignRoletoUser waitTime() {
		
		implicitWait();
		
		return this;

}
public AssignRoletoUser executeScript()

{
	return executeScript();
}


	public AssignRoletoUser mouseHOverRoleandPrivilege()
	{
		
		//mouseHoverByXpath("//div[@class='horizontal-navigation']//ul//li//ul//li//a[@href='#'][normalize-space()='Role & Privilege']");
		mouseHoverByXpath("//a[text()='Role & Privilege']/parent::*");
		return this;
		
	}
	public AssignRoletoUser clickAssignRoletoUser()
	{
		
		
		//clickByXpath("//a[normalize-space()='Assign Role to User']");
		clickByXpath("a[href='/userRole']");
		return this;
		
	}
	
	
	public AssignRoletoUser clickaddUserRoleBtn()
	{
		
		
		clickByXpath("//input[@id='addUserRoleBtn']");
		//clickByXpath("//a[text()='Add User']");
		return this;
		
	}
	
	public AssignRoletoUser selectOnCompany(String title)
	{
		selectVisibileTextByXpath("//select[@id='companyListUserRole']",title);
		
		return this;
		
	}
	public AssignRoletoUser selectOnCompany1(String title)
	{
		selectVisibileTextByXpath("//select[@id='companyList']",title);
		
		return this;
		
	}
	public AssignRoletoUser selectOnUser(String title)
	{
		selectVisibileTextByXpath("//select[@id='userNamesList']",title);
		
		return this;
		
	}
	public AssignRoletoUser selectOnRole(String title)
	{
		selectVisibileTextByXpath("//select[@id='userRolesList']",title);
		
		return this;
		
	}
	public AssignRoletoUser selectOnDisabled(String title)
	{
		selectVisibileTextByXpath("//select[@id='isDisabled']",title);
		
		return this;
		
	}
	public AssignRoletoUser clickSubmitBtn()
	{
		
		
		clickByXpath("//input[@id='submitbtnUserRole']");
		//clickByXpath("//a[text()='Add User']");
		return this;
		
	}
	public void switchToLastWindow()
	{
		switchToLastWindow();
		
	}
	
}
