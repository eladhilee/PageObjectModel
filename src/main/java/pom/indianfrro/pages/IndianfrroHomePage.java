package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianfrroHomePage extends GenericWrappers {
	
	public IndianfrroRegPage ClickOnOk() {
		clickByXpath("//a[text()='Sign Up (Registration)']'");
		return new IndianfrroRegPage();
	}
}
