package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DuplicateLead";
		testDescription="login to LeafTaps And Create a Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Geeno";
		browserName="chrome";
		dataSheetName="TC001";
		sheetIndex=2;
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void fnEditLead(String uName,String pwd, String email) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFAlink()
		.clickLeadsLink()
		.clickMenuFindLeads()
		.clickEmailtab()
		.enterEmailAddress(email)
		.clickbtnFindLeads()
		.getLabelFirstName()
		.clickFirstSearch()
		.clickBtnDuplicateLead()
		.verifyTitlePage()
		.clickBtnCreateLead()
		.verifyDuplicatedName();
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/	
		
		
	}

}
