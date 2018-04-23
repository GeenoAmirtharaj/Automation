package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	public EditLead typeCompanyName(String data) {
		//WebElement eleUserName = locateElement("username");
		type(eleCompanyName, data);
		return this;
	}
	@FindBy(how=How.XPATH, using="//input[starts-with(@value,'Update')]")
	private WebElement btnUpdate;
	public ViewLead clickUpdatebtn() {
		click(btnUpdate);
		return new ViewLead();
	}
}
