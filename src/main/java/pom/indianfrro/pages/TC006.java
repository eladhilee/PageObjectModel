package pom.indianfrro.pages;

import pom.indianfrro.pages.IndianfrroHomePage;

import wrappers.GenericWrappers;

public class TC006  {
	public void indianFrroRegPage(){
		
		new IndianfrroHomePage(). ClickOnOk()
		
		.enterUid("elavenil")
		.enterUpwd("dhileeban@58")
		.enterURpwd("dhileeban@58")
	     .selectSecurityQuestionOption("What is the name of your favorite book?")
		.enterFrroSecurityAnswer("dhileeban")
		.enterFrroName("elavenil")
		.selectGenderOption("Female")
		.clickFrroDob()
		.enterEmail("eladhilee@gmail.com")
		.enterMobile("9659944687")
		.enterPhoneno("9976588337")
		.selectFrroNationalityOption("INDIA")
		.enterFrroNamee("vimal")
		.enterAddress("saravanas icecream")
		.selectFrroStateOption("TAMILNADU")
		.selectFrroCityOption("Select")
		.selectAccomodationTypeOption("Bed and Breakfast")
		.selectAccomodatioGradeOption(" Five Star")
		.enterFrroEmail1("gelavenil58@gmail.com")
		.enterFrroMobile("9659944687")
		.enterFrroPhone("9976588337")
		.enterFrroName1("vimal")
		.enterAddress1("saravans icecream")
		.selectState1Option("TAMILNADU")
		.selectCity1Option("Select")
		.enterFrroEmail2("eladhilee@gmail.com")
		.enterPhoneno1("9976588337")
		.enterMobile1("9654443389")
		.clickAdd()
		.clickAddCheckBox();
}
}
