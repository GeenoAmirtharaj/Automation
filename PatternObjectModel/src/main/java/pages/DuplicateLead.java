package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead() {
		PageFactory.initElements(driver,this);
	}

	public DuplicateLead verifyTitlePage() {
		boolean verifytitle = verifyTitle("Duplicate Lead");
		if(verifytitle)
			System.out.println("Title verified and it is Duplicate Lead");
		else
			System.out.println("Title is not Duplicate Lead");
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement btnCreateLead;
	public ViewLead clickBtnCreateLead() {
		click(btnCreateLead);
		return new ViewLead();
	}
}
