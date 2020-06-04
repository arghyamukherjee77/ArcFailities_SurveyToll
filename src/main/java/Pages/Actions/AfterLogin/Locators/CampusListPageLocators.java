package Pages.Actions.AfterLogin.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class CampusListPageLocators {
	
	@FindAll({
			@FindBy(xpath="//button[@id='btnNewProject']"),
	        @FindBy(css= "button#btnNewProject")        
	})

	public WebElement createCampus;
	
	@FindBy(xpath = "//input[@name='txtProjectName']")
	public WebElement campusname;
	
	@FindBy(css = "select#ddlCompCountry")
	public WebElement countrydropdown;
	
	@FindBy(css = "select#ddlCompState")
	public WebElement statedropdown;
	
	@FindBy(css="input#btnSave")
	public WebElement savecampusbtn;

}
