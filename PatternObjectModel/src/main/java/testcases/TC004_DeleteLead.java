package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="login to LeafTaps And Create a Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Geeno";
		browserName="chrome";
		dataSheetName="TC001";
		sheetIndex=3;
	}
	@Test(dataProvider="fetchData")
	public void fnEditLead(String uName,String pwd, String pno) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFAlink()
		.clickLeadsLink()
		.clickMenuFindLeads()
		.clickPhonetab()
		.enterPhoneNumber(pno)
		.clickbtnFindLeads()
		.clickFirstSearch()
		.clickBtnDelete()
		.clickMenuFindLeads()
		.enterLeadID()
		.clickbtnFindLeads()
		.getLabelErrorMessage();
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/	
		
		
	}

}
