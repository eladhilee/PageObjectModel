package pom.panindia.pages;
import pom.panindia.pages.PanHomePage;

import wrappers.GenericWrappers;

public class TC004 {
public void panHomePage(){

	new PanHomePage().SelectOnFullNameOption("MISS")
	.enterPanfirstName("junit")
	.enterPanMiddleName("testng")
	.enterPanLastName("maven")
	.enterFatherFName("cucmber")
	.enterFatherMName("bdd")
	.enterFatherLName("protractor")
	.enterPanMobile("9976588337")
	.enterPanemail("tester123@gmail.com")
	.selectOnSourceofIncomeOption("Business")
	.clickOffice()
	.enterPanVillage("saravans icecream")
	.enterPanRoad("bharath")
	.enterPanCityName("nellai")
	.selectOnStateOption("TamilNadu")
	.enterPincode("672001")
	.selectOnCountryOption("INDIA")
	.enterPanOffice("nellai")
	.enterPanBuilding("tvl")
	.enterPanRoad1("main")
	.enterPanTown("thirunelveli")
	.selectOnUnionTerritoryOption("TamilNadu")
	.enterZipcode("456")
	.enterPanCountry("india")
	.selectOnIdentityProofOption("Aadhar Card issued by UIDAI")
	.selectOnAddressProofOption("PASSPORT")
	.selectOnDOBProofOption("Marriage Certificate issued by Registrar of Marriages")
	.selectOnAadhaarProofOption("copy of Aadhaar Card")
	.selectOnOfficeAddressproofOption("Bank statement carrying Office Address")
	
	.clickPanSource();
}
}
