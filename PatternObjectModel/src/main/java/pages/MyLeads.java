package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement linkCreateLead;
	public CreateLeads clickMyCreateLead() {
		click(linkCreateLead);
		return new CreateLeads();
	}
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	private WebElement menuFindLeads;
	public FindLeads clickMenuFindLeads() {
		click(menuFindLeads);
		return new FindLeads();
	}
}
