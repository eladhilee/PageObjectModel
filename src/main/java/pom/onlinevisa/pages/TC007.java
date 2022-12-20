package pom.onlinevisa.pages;
public class TC007  {
		public void onlineusvisaRegPage(){
			
			new OnlineusvisaRegPage().enterVisaGName("junit")
			.enterVisaSName("java")
			.enterVisaFullName("testng")
			.clickVisaYes()
			.enterVisaOtherSName1("cucmber")
			.enterVisaOtherGName1("protractor")
			.enterVisaEmail("tester123@gmail.com")
			.enterVisaCEmail("tester456@gmail.com")
			.clickVisaYes1()
			.enterVisaAEmail("tester789@gmail.com")
			.clickVisaAGender()
			.clickVisacalender()
			.selectOnyear("2021")
			.selectOnomonth("June")
			.enterVisaCityob("nellai")
			.enterVisaProvinceob("tvl")
			.selectOncountry("India")
			.selectOnNatioality("India")
			.clickyes()
			.selectOnRCountryOption("India");
			
			

	}
	}


