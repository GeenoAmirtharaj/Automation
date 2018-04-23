package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement btnEdit;
	public EditLead clickBtnEdit() {
		click(btnEdit);
		return new EditLead();
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement lblCompanyName;
	private String text;
	public ViewLead verifyUpdatedCompanyName(String data) {
		text=getText(lblCompanyName);
		if(text.contains(data))
			System.out.println("Updated Value is present in the screen");
		return this;
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement labelSpanName;
	public ViewLead verifyDuplicatedName() {
		//WebElement eleUserName = locateElement("usernama");
		String text = labelSpanName.getText();
		if(leadsNameofFirstElement.equals(text))
			System.out.println("Duplicated Names are Same");
		else
			System.out.println("Duplicated Names are not Same");
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement btnDuplicate;
	public DuplicateLead clickBtnDuplicateLead() {
		click(btnDuplicate);
		return new DuplicateLead();
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement btnDelete;
	public MyLeads clickBtnDelete() {
		click(btnDelete);
		return new MyLeads();
	}
}
