package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//div[@class='x-form-item x-tab-item'][2]/div/input")
	private WebElement eleFirstName;
	public FindLeads enterFirstName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement btnFindLeads;
	public FindLeads clickbtnFindLeads() {
		click(btnFindLeads);
		return this;
	}
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/following::a[6]")
	private WebElement elesSecondSearch;
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstSearch;
	public ViewLead clickFirstSearch() throws InterruptedException {
		Thread.sleep(2000);
		firstSearchLeadsID=eleFirstSearch.getText();
		mergeSearchLeadsID=elesSecondSearch.getText();
		System.out.println(firstSearchLeadsID);
		System.out.println(mergeSearchLeadsID);
		click(eleFirstSearch);
		return new ViewLead();
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	private WebElement eleLeadID;
	public FindLeads enterLeadID() {
		//WebElement eleUserName = locateElement("usernama");
		type(eleLeadID, firstSearchLeadsID);
		return this;
	}
	@FindBy(how=How.LINK_TEXT, using="Email")
	private WebElement eleEmailtab;
	public FindLeads clickEmailtab() {
		click(eleEmailtab);
		return this;
	}
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmail;
	public FindLeads enterEmailAddress(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleEmail, data);
		return this;
	}
	@FindBy(how=How.LINK_TEXT, using="Phone")
	private WebElement elePhonetab;
	public FindLeads clickPhonetab() {
		click(elePhonetab);
		return this;
	}
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNumber;
	public FindLeads enterPhoneNumber(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(elePhoneNumber, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement lblFirstname;
	public FindLeads getLabelFirstName() {
		//WebElement eleUserName = locateElement("usernama");
		leadsNameofFirstElement =getText(lblFirstname);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement lblError;
	public FindLeads getLabelErrorMessage() {
		//WebElement eleUserName = locateElement("usernama");
		verifyDisplayed(lblError);
		return this;
	}
	/*@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstEmailSearch;
	public ViewLead clickFirstEmailSearch() throws InterruptedException {
		Thread.sleep(2000);
		click(eleFirstEmailSearch);
		return new ViewLead();
	}*/
	
}
