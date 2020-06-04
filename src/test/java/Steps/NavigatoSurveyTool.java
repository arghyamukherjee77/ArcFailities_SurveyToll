package Steps;

import org.testng.Assert;

import Pages.Actions.Compliance.Actions.ComplianceHomePage;
import Pages.Actions.Compliance.Surveytab.SurveryTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NavigatoSurveyTool {

	ComplianceHomePage compliancehomepage = new ComplianceHomePage();
	SurveryTab surveytab = new SurveryTab();

	@Then("^click on survey link to navigate to Survey Tool$")
	public void click_on_survey_link_to_navigate_to_Survey_Tool() throws Throwable {
		compliancehomepage.navigateToSurveytab();
	}

	@And("^observe that if no survey is created then user user be displayed with \"([^\"]*)\"$")
	public void observe_that_if_no_survey_is_created_then_user_user_be_displayed_with(String validationfornosurvey)
			throws Throwable {
		String expectedvalidation = validationfornosurvey;
		String actualvalidation = surveytab.verifythepresenceofValidationMessageforNoSurvey();
		if (actualvalidation.contains("Already Present")) {
			System.out.println("Survey already present hence validation wont appear");
		} else {
			Assert.assertEquals(actualvalidation, expectedvalidation, "Test Validation");
		}
	}

}
