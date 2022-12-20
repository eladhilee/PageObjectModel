package pom.onlinevisa.pages;


import wrappers.GenericWrappers;

public class OnlineusvisaRegPage extends GenericWrappers {
	
	
	
	
	
	public OnlineusvisaRegPage enterVisaGName(String GName)
	{
		enterByXpath("//input[@id='app-given-names']", GName);
		return this;
	}
    public OnlineusvisaRegPage enterVisaSName(String SName)
	{
		enterByXpath("//input[@id='app-surname']", SName);
		return this;
	}
    public OnlineusvisaRegPage enterVisaFullName(String fullname)
	{
		
		enterByXpath("//input[@id='app-native-name']", fullname);
		return this;
	}
    public OnlineusvisaRegPage clickVisaYes()
	{
	
		clickByXpath("//input[@id='other-names-used-Yes']");
		return this;
	}
    public OnlineusvisaRegPage enterVisaOtherSName1(String surname)
	{
		enterByXpath("//input[@id='other-surname']", surname);
		return this;
	}
    public OnlineusvisaRegPage enterVisaOtherGName1(String gnames)
   	{
   		enterByXpath("//input[@id='other-given-names']", gnames);
   		return this;
   	}
    public OnlineusvisaRegPage enterVisaEmail(String email)
   	{
   		enterByXpath("//input[@id='email']", email);
   		return this;
   	}
       public OnlineusvisaRegPage enterVisaCEmail(String email1)
      	{
      		enterByXpath("//input[@id='email-1']", email1);
      		return this;
      	}
       public OnlineusvisaRegPage clickVisaYes1()
   	{
   		
   		clickByXpath("//input[@id='additional-email-Yes']");
   		return this;
   	}
       
       public OnlineusvisaRegPage enterVisaAEmail(String visaemail)
     	{
     		enterByXpath("//input[@id='additional-email-detail']", visaemail);
     		return this;
     	} 
       //check
       public OnlineusvisaRegPage clickVisaAGender()
    	{
    		
    		clickByXpath("//input[@id='gender-Female']");
    		return this;
    	} 
       public OnlineusvisaRegPage clickVisacalender()
   	{
   		
   		clickByXpath("//div[@class='picker__day picker__day--infocus']");
   		return this;
   	} 
       
       public OnlineusvisaRegPage selectOnyear(String year)
      	{
    	   selectVisibileTextByXpath("//select[@class='picker__select--year']/option[text()='1993']",year);
    	  
      		return this;
      	} 

       public OnlineusvisaRegPage selectOnomonth(String month)
      	{
    	   selectVisibileTextByXpath("//select[@class='picker__select--month']/option[text()='June']", month);
    	
      		return this;
      	} 
      
       public OnlineusvisaRegPage enterVisaCityob(String citybirth)
     	{
     		enterByXpath("//input[@id='city-of-birth']", citybirth);
     		return this;
     	}
       public OnlineusvisaRegPage enterVisaProvinceob(String statebirth)
    	{
    		enterByXpath("//input[@name='state-of-birth']", statebirth);
    		return this;
    	}
      
       

    public OnlineusvisaRegPage selectOncountry(String country)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='country-of-birth']/option[text()='India']",country);
    	
   	    return this;
   	}
   
    public OnlineusvisaRegPage selectOnNatioality(String nationality)
   	{
    	
    	selectVisibileTextByXpath("//select[@id='nationality']/option[text()='India ']",nationality);
    	
   		return this;
   	}
    
    public OnlineusvisaRegPage clickyes()
   	{
   		
   		clickByXpath("//input[@id='select-perm-resident-other-country-Yes']");
   		return this;
   	} 
  
    public OnlineusvisaRegPage selectOnRCountryOption(String rcountry)
  	{
    	selectVisibileTextByXpath("//select[@id='perm-resident-other-country']/option[text()='India']",rcountry);
      
  		return this;
  	}
    


}
