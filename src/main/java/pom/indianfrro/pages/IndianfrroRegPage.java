package pom.indianfrro.pages;




import wrappers.GenericWrappers;

public class IndianfrroRegPage extends GenericWrappers 
{
	
	
	
	public IndianfrroRegPage enterUid(String uid)
	{
		enterByXpath("//input[@id='u_id']", uid);
		return new IndianfrroRegPage();
	}
    public IndianfrroRegPage enterUpwd(String upwd)
	{
		enterByXpath("//input[@id='u_pwd']", upwd);
		return this;
	}
    public IndianfrroRegPage enterURpwd(String URpwd)
	{
		enterByXpath("//input[@id='u_repwd']", URpwd);
		return this;
	}
    
    public IndianfrroRegPage selectSecurityQuestionOption(String u_secques )
   	{
    	
    	selectValueByXpath("//select[@id='u_secques']/option[text()=' What is the name of your favorite book?']",u_secques);
    	
   		
   		return this;
   	}
		public IndianfrroRegPage enterFrroSecurityAnswer(String secans)
		{
			
			enterByXpath("//input[@id='u_secans']", secans);
			return this;
		}
	    public IndianfrroRegPage enterFrroName(String uname)
		{
			
			enterByXpath("//input[@id='u_name']", uname);
			return this;
		}
	   
	    public IndianfrroRegPage selectGenderOption(String u_gender)
	   	{
	    	
	    	selectVisibileTextByXpath("//select[@id='u_gender']/option[text()=' Female']",u_gender);
	    	
	   		
	   		return this;
	   	}
	   
	    //check with table
	    public IndianfrroRegPage clickFrroDob()
		{
	    	//selectDate("month_year","select_day");
			//clickDatePicker("//input[@id='u_dob']");
			return this;
		}
	    public IndianfrroRegPage enterDestination(String destination)
		{
			enterByXpath("//input[@id='u_designation']", destination);
			return this;
		}
	    public IndianfrroRegPage enterEmail(String emailid)
		{
			enterByXpath("//input[@id='u_emailid']", emailid);
			return this;
		}
	    public IndianfrroRegPage enterMobile(String mobile)
		{
			
			enterByXpath("//input[@id='u_mobile']", mobile);
			return this;
		}
	    public IndianfrroRegPage enterPhoneno(String phone)
		{
			
			enterByXpath("//input[@id='u_phone']", phone);
			return this;
		}
	   
	    public IndianfrroRegPage selectFrroNationalityOption(String u_nationality)
	   	{
	    	
	    	selectVisibileTextByXpath("//select[@id='u_nationality']/option[text()=' INDIA']",u_nationality);
	    	
	   		return this;
	   	}
	    
	    public IndianfrroRegPage enterFrroNamee(String name)
		{
			enterByXpath("//input[@id='name']", name);
			return this;
		}
	    public IndianfrroRegPage enterAddress(String address)
		{
			enterByXpath("//input[@id='address']", address);
			return this;
		}
	    //check
	    
	    public IndianfrroRegPage selectFrroStateOption(String state)
	   	{
	   		
	    	selectVisibileTextByXpath("//select[@id='state']/option[text()=' TAMIL NADU']",state);
	    	
	   		return this;
	   	}
	    //check
	  
	    public IndianfrroRegPage selectFrroCityOption(String city_distr)
		{
	    	
	    	selectVisibileTextByXpath("//select[@id='city_distr']/option[text()='Select']",city_distr);
	    	
			return this;
		}
	  
	    public IndianfrroRegPage selectAccomodationTypeOption(String acco_type)
	   	{
	    	
	    	selectVisibileTextByXpath("//select[@id='acco_type']/option[text()=' Bed and Breakfast']",acco_type);
	    	
	   		return this;
	   	}
	   
	    public IndianfrroRegPage selectAccomodatioGradeOption(String star_rat)
	   	{
	    	
	    	selectVisibileTextByXpath("//select[@id='star_rat']/option[text()=' Five Star']",star_rat);
	    	
	   		return this;
	   	}
	    
	    public IndianfrroRegPage enterFrroEmail1(String email)
		{
			
			enterByXpath("//input[@id='email']", email);
			return this;
		}
	    public IndianfrroRegPage enterFrroMobile(String mcontact)
		{
			
			enterByXpath("//input[@id='mcontact']", mcontact);
			return this;
		}
	    public IndianfrroRegPage enterFrroPhone(String contact)
		{
			
			enterByXpath("//input[@id='contact']", contact);
			return this;
		}
	    public IndianfrroRegPage enterFrroName1(String nameo)
		{
			
			enterByXpath("//input[@id='name_o']", nameo);
			return this;
		}
	    public IndianfrroRegPage enterAddress1(String addresso)
		{
			
			enterByXpath("//input[@id='address_o']", addresso);
			return this;
		}
	    
	    public IndianfrroRegPage selectState1Option(String state_o)
	   	{
	    	selectVisibileTextByXpath("//select[@id='state_o']/option[text()=' TAMIL NADU']",state_o);
	    	
	   		return this;
	   	}
	  
	   public IndianfrroRegPage selectCity1Option(String citydistr_o1)
	   	{
		   
		   
		   selectVisibileTextByXpath("//select[@id='citydistr_o1']/option[text()='Select']",citydistr_o1);
		  
	   		return this;
	   	}
	    
	    public IndianfrroRegPage enterFrroEmail2(String emailido)
		{
			
			enterByXpath("//input[@name='emailid_o']", emailido);
			return this;
		}
	    public IndianfrroRegPage enterPhoneno1(String phoneno)
		{
			
			enterByXpath("//input[@name='phoneno_o']", phoneno);
			return this;
		}
	    public IndianfrroRegPage enterMobile1(String mobile)
		{
			
			enterByXpath("//input[@name='mobile_o']", mobile);
			return this;
		}
	    public IndianfrroRegPage clickAdd()
		{
			
			
			clickByXpath("//input[@onclick='addInput()']");
			return this;
		}
	    public IndianfrroRegPage clickAddCheckBox()
		{
			
			clickByXpath("//input[@name='ownchecks']");
			return this;
		}
}
