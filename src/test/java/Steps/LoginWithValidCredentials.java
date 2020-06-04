package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.arc.errorcollectors.ErrorCollector;
import com.arc.pages.topnavigation.TopNavigationPage;

import Pages.Actions.LoginPage.LoginPage;
import Utils.SeleniumDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithValidCredentials {

	LoginPage lp = new LoginPage();
	TopNavigationPage topnav = new TopNavigationPage();

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String TestUrl) throws Throwable {
		System.out.println("URL to test: " + TestUrl);
		SeleniumDriver.openPage(TestUrl);
	}

	@When("^Provide valid \"([^\"]*)\" username in the username textbox$")
	public void provide_valid_username_in_the_username_textbox(String username) throws Throwable {
		lp.navigateToUserNameField(username);
	}

	@And("^Provide valid \"([^\"]*)\" password in the password textbox$")
	public void provide_valid_password_in_the_password_textbox(String password) throws Throwable {
		lp.navigateToPasswordField(password);
	}

	@And("^Click on the Login Button$")
	public void click_on_the_Login_Button() throws Throwable {
		lp.clickOnLoginButton();
	}

	@Then("^User should be navigated into the Arcfacilities application$")
	public void user_should_be_navigated_into_the_Arcfacilities_application() throws Throwable {
		SeleniumDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(SeleniumDriver.getDriver().getTitle());
	}

	@Then("^user should be able to view \"([^\"]*)\" menu in the top menu bar$")
	public void user_should_be_able_to_view_menu_in_the_top_menu_bar(String arg1) throws Throwable {
		String expected = topnav.topnavloc.capusmenu.getText();
		System.out.println("Expected Element: " + expected);
		String actual = SeleniumDriver.getDriver().findElement(By.xpath("//a[@data-original-title='Campuses']"))
				.getText();
		System.out.println("Actual Element: " + actual);
		ErrorCollector.verifyEquals(expected, actual);
	}

}
