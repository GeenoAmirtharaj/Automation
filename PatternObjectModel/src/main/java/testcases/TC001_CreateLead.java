package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="login to LeafTaps And Create a Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Geeno";
		browserName="chrome";
		dataSheetName="TC001";
		sheetIndex=0;
	}
	@Test(dataProvider="fetchData")
	public void fnCreateLead(String uName,String pwd, String cname, String fname, String lname,String email,String pno) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFAlink()
		.clickLeadsLink()
		.clickMyCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterEmail(email)
		.enterPhone(pno)
		.clickCreateLead();
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/	
		
		
	}

}
