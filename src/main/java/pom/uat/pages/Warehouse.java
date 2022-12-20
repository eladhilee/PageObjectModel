package pom.uat.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Warehouse extends GenericWrappers {
	
		
		
		public Warehouse(RemoteWebDriver driver,ExtentTest test) 
		{
			this.driver=driver;
			this.test=test;
		}
		public Warehouse mouseHOverWarehouse()
		{
			
			
			//mouseHoverByXpath("//body/div[@class='layout-wrapper']/div[@class='content-wrapper']/div[@class='horizontal-navigation']/ul/li[3]/a[1]");
			mouseHoverByXpath("//body/div[@class='layout-wrapper']/div[@class='content-wrapper']/div[@class='horizontal-navigation']/ul/li[5]/a[1]");
			return new Warehouse(driver,test);
			
		}
		public Warehouse waitTime() {
			
			implicitWait();
			
			return this;
			
		}
		public Warehouse mouseHOverWarehouseMgmt()
		{
			
			mouseHoverByXpath("//a[normalize-space()='Warehouse Management']");
			//mouseHoverByXpath("//a[text()='User Master']/parent::*");
			return this;
			
		}
		public Warehouse clickMaterial()
		{
			
			
			clickByXpath("//a[normalize-space()='Material Group']");
			//clickByXpath("//a[text()='Add User']");
			return this;
			
		}
		

}
