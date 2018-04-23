package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{

	public CreateLeads() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeads enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeads enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeads enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeads enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	public CreateLeads enterPhone(String data) {
		type(elePhone, data);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement btnCreateLead;
	public ViewLead clickCreateLead() {
		click(btnCreateLead);
		return new ViewLead();
	}
	

}
