package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_EditLead";
		testDescription="login to LeafTaps And Create a Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Geeno";
		browserName="chrome";
		dataSheetName="TC001";
		sheetIndex=1;
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void fnEditLead(String uName,String pwd, String fname, String cname,String updatedname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFAlink()
		.clickLeadsLink()
		.clickMenuFindLeads()
		.enterFirstName(fname)
		.clickbtnFindLeads()
		.clickFirstSearch()
		.clickBtnEdit()
		.typeCompanyName(cname)
		.clickUpdatebtn()
		.verifyUpdatedCompanyName(updatedname);
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/	
		
		
	}

}
