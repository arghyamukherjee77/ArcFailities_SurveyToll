package Steps;

import org.testng.Assert;

import Pages.Actions.AfterLogin.ExistingCampusHomePage;
import Pages.Actions.Compliance.Actions.ComplianceHomePage;
import Utils.SeleniumDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NavigatetoComplianceHomeandVerifyHeader {
	
	ComplianceHomePage compliancehome=new ComplianceHomePage();
	ExistingCampusHomePage existingcampushome=new ExistingCampusHomePage();
	
	@Then("^click on the \"([^\"]*)\" menu$")
	public void click_on_the_menu(String arg1) throws Throwable {
		existingcampushome.navigateToComplianceModule();
	
	}

	@And("^Verify the header of the Compliance Home Page is \"([^\"]*)\"$")
	public void verify_the_header_of_the_Compliance_Home_Page_is(String arg1) throws Throwable {
		String actualHeader=compliancehome.verifytheHeaderTextOfComplianceHome();
		String expected_header=arg1;
		Assert.assertEquals(expected_header, actualHeader);
	}



}
