package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="login to LeafTaps And Create a Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Geeno";
		browserName="chrome";
		dataSheetName="TC001";
		sheetIndex=4;
	}
	@Test(dataProvider="fetchData")
	public void fnEditLead(String uName,String pwd) throws InterruptedException{
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFAlink()
		.clickLeadsLink()
		.clickMenuFindLeads()
		.clickFirstSearch();
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/	
	}
}
