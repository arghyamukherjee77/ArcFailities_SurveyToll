package Pages.Locators.LoginPageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	
	@FindBy(xpath ="//input[@id='UserID']" )
	public WebElement username;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement password;
	
	@FindBy(xpath ="//button[@id='btnLogin']")
	public WebElement loginBtn;

}
