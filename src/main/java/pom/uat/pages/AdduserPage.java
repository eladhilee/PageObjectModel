package pom.uat.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import pom.facebook.pages.FacebookPage;
import pom.facebook.pages.FacebookRegPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.IrctcPassengerDetailsNoPage;
import wrappers.GenericWrappers;

public class AdduserPage extends GenericWrappers{
	
	
	public AdduserPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
	}
	public AdduserPage mouseHOverUser()
	{
		
		
		
		//mouseHoverByXpath("//body/div[@class='layout-wrapper']/div[@class='content-wrapper']/div[@class='horizontal-navigation']/ul/li[3]/a[1]");
		mouseHoverByXpath("//a[contains(text(),'User ')]");
		return new AdduserPage(driver,test);
		
	}
	public AdduserPage waitTime() {
		
		implicitWait();
		
		return this;
		
	}
	public AdduserPage mouseHOverUserMaster()
	{
		
		//mouseHoverByXpath("//div[@class='horizontal-navigation']//ul//li//ul//li//a[@href='#'][normalize-space()='User Master']");
		mouseHoverByXpath("//a[text()='User Master']/parent::*");
		return this;
		
	}
	public AdduserPage clickAddUser()
	{
		
		
		clickByXpath("//a[normalize-space()='Add User']");
		//clickByXpath("//a[text()='Add User']");
		return this;
		
	}
	
	public AdduserPage clickAddUserButton() {
		
		
		clickByXpath("//input[@id='addUserBtn']");
     	return this;
		
	}
	public AdduserPage selectOnCompany(String title)
	
	{
	
		selectVisibileTextByXpath("//select[@id='companyList']",title);
		
		return this;
		
	}
	
	public AdduserPage selectOnCompany1(String title)
	{
		selectVisibileTextByXpath("//select[@id='companyList2']",title);
		
		return this;
		
	}
	
	public AdduserPage selectOnBranch(String title)
	{
		selectVisibileTextByXpath("//select[@id='branchList']",title);
		
		return this;
		
	}
	
	public AdduserPage selectOnDepartment(String title)
	{
		selectVisibileTextByXpath("//select[@id='departmentList']",title);
		
		return this;
		
	}
	
	public AdduserPage enterFirstName(String firstname )
	{     
		
		enterByXpath("//input[@name=\"firstName\"]", firstname);
		return this;
	}
	

	public AdduserPage enterMiddleName(String middlename )
	{     
		
		enterByXpath("//input[@id=\"middleName\"]", middlename);
		return this;
	}
	public AdduserPage enterLastName(String Lastname )
	{     
		
		enterByXpath("//input[@id=\"lastName\"]", Lastname);
		return this;
	}
	//input[@id="username"]
	
	public AdduserPage enteruserName1(String username1 )
	{     
		
		enterByXpath("//input[@id=\"username\"]", username1);
		return this;
	}
	//input[@id="emailId"]
	
	public AdduserPage enterEmail(String email )
	{     
		
		enterByXpath("//input[@id=\"emailId\"]", email);
		return this;
	}
	public AdduserPage enterNationalId(String NationalId )
	{     
		
		enterByXpath("//input[@id=\"nationalIdNo\"]", NationalId);
		return this;
	}
	public AdduserPage enterContact(String contact )
	{     
		
		enterByXpath("//input[@id=\"contact\"]", contact);
		return this;
	}
	public AdduserPage selectOnDisabled(String Disabled )
	{     
		
		selectVisibileTextByXpath("//select[@id=\"isDisabled\"]",Disabled);
		return this;
	}
	public AdduserPage clickSave( )
	{     
		
		clickByXpath("//input[@id=\"submitbtnUser\"]");
		return this;
	}
	

}
