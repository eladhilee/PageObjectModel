package pom.panindia.pages;


import wrappers.GenericWrappers;

public class PanHomePage extends GenericWrappers{
	
	
    public PanHomePage SelectOnFullNameOption(String pan_title)
   	{
    	selectVisibileTextByXpath("//select[@id='pan_title']/option[text()='MISS']",pan_title);
    	
   		return this;
   	}
	public PanHomePage enterPanfirstName(String firstname)
	{
		
		enterByXpath("//input[@id='pan_firstname']",firstname );
		return this;
	}
    public PanHomePage enterPanMiddleName(String middlename)
	{
	
		enterByXpath("//input[@id='pan_middlename']", middlename);
		return this;
	}
	public PanHomePage enterPanLastName(String lastname)
	{
		
		enterByXpath("//input[@id='pan_lastname']", lastname);
	  return this;
	}
	
	
	public PanHomePage enterFatherFName(String fName)
	{
		
		enterByXpath("//input[@id='pan_fatherfirstname']", fName);
		return  this;
	}
  public PanHomePage enterFatherMName(String fmName)
	{
	
		enterByXpath("//input[@id='pan_fathermiddlename']", fmName);
		return this;
	}
	public PanHomePage enterFatherLName(String flName)
	{
		
		enterByXpath("//input[@id='pan_fatherlastname']", flName);
		return this;
	}
	
	
	public PanHomePage enterPanMobile(String moblie)
	{
		
		enterByXpath("//input[@id='pan_mobilenumber']", moblie);
		return this;
	}
	
	public PanHomePage enterPanemail(String email)
	{
		
		enterByXpath("//input[@id='pan_email']", email);
		return this;
	}
	
    public PanHomePage selectOnSourceofIncomeOption(String pan_sourceofincome)
   	{
    	selectVisibileTextByXpath("//select[@id='pan_sourceofincome']/option[text()='Business/Profession']",pan_sourceofincome);
    	
   		
   		return this;
   	}
    
  
	public PanHomePage clickOffice()
	{
		
		clickByXpath("//input[@id='office']");
		return this;
	}
	//check update table
	public PanHomePage enterDob(String dob)
	{
		
		enterByXpath("//input[@id='office']", dob);
		return this;
	}
	public PanHomePage enterPanVillage(String village)
	{
		
		enterByXpath("//input[@id='pan_addressline1']", village);
		return this;
		
	}
	public PanHomePage enterPanRoad(String panroad)
	{
		
		enterByXpath("//input[@id='pan_addressline2']", panroad);
		return this;
	
	}
	public PanHomePage enterPanCityName(String cityname)
	{
		
		enterByXpath("//input[@id='pan_cityname']", cityname);
		return this;
	}
	
    public PanHomePage selectOnStateOption(String pan_state)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='pan_state']/option[text()='Tamil Nadu']",pan_state);
    	
   		return this;
   	}
	public PanHomePage enterPincode(String pincode)
	{
		
		enterByXpath("//input[@name='pan_pincode']", pincode);
		return this;
	
	}
	
	public PanHomePage selectOnCountryOption(String pan_country )
	{
		
		selectVisibileTextByXpath("//select[@id='pan_country']/option[text()='INDIA']",pan_country);
		
		return this;
	}
	public PanHomePage enterPanOffice(String panoffice)
	{
		
		enterByXpath("//input[@id='pan_officename']", panoffice);
		return this;
	
	}
	public PanHomePage enterPanBuilding(String panbuilging)
	{
	    enterByXpath("//input[@id='pan_officeaddressline1']", panbuilging);
		return this;
	}
	public PanHomePage enterPanRoad1(String panroad)
	{
		
		enterByXpath("//input[@id='pan_officeaddressline2']", panroad);
		return this;
	
	}
	public PanHomePage enterPanTown(String pantown)
	{
		
		enterByXpath("//input[@id='pan_officecityname']", pantown);
		return this;
	}
	
    public PanHomePage selectOnUnionTerritoryOption(String pan_officestate)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='pan_officestate']/option[text()='Tamil Nadu']",pan_officestate);
    	
   		return this;
   	}
	
	public PanHomePage enterZipcode(String zipcode)
	{
		
		enterByXpath("//input[@id='pan_officepincode']", zipcode);
		return this;
	
	}
	public PanHomePage enterPanCountry(String pancountry)
	{
		
		enterByXpath("//*[@id='pan_officecountry']", pancountry);
		return this;
	}
	
    public PanHomePage selectOnIdentityProofOption(String pan_identityproof)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='pan_identityproof']/option[text()='Aadhar Card issued by UIDAI(In Copy)']",pan_identityproof);
    	
   		return this;
   	}
   
    public PanHomePage selectOnAddressProofOption(String pan_addressproof)
   	{
    	selectVisibileTextByXpath("//select[@id='pan_addressproof']/option[text()='PASSPORT (In Copy)']",pan_addressproof);
    	
   		return this;
   	}
    
    public PanHomePage selectOnDOBProofOption(String pan_DOBproof)
   	{
    	selectVisibileTextByXpath("//select[@id='pan_DOBproof']/option[text()='Marriage Certificate issued by Registrar of Marriages (In Copy)']",pan_DOBproof);
    	
   		return this;
   	}
   
    public PanHomePage selectOnAadhaarProofOption(String pan_aadhaarproof)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']/option[text()='Copy of Aadhaar Card / Letter']",pan_aadhaarproof);
    	
   		return this;
   	}
   
    public PanHomePage selectOnOfficeAddressproofOption(String pan_officeaddressproof)
   	{
    	selectVisibileTextByXpath("//select[@id='pan_officeaddressproof']/option[text()='Bank statement carrying Office Address']",pan_officeaddressproof);
    	
        return this;
   	}
    public PanHomePage clickPanSource()
	{
		
		clickByXpath("//input[@id='pan_source']");
		return new PanHomePage();
	}
	
	
}
