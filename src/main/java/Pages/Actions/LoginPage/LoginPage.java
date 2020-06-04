package Pages.Actions.LoginPage;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.Locators.LoginPageLocators.LoginPageLocators;
import Utils.SeleniumDriver;

public class LoginPage{
	
	LoginPageLocators lplocators;
	
	public LoginPage()
	{
		this.lplocators=new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.lplocators);
	}
	
	public void navigateToUserNameField(String username)
	{
		lplocators.username.sendKeys(username);
	}
	
	public void navigateToPasswordField(String password)
	{
		lplocators.password.sendKeys(password);
	}
	
	
	public void clickOnLoginButton()
	{
		lplocators.loginBtn.click();
	}
	
	public void registerUser()
	{
		
		
	}
	
	
	

}
