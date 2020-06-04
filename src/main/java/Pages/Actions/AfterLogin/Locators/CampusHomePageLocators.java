package Pages.Actions.AfterLogin.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampusHomePageLocators {
	
	@FindBy(xpath="//iframe[@id='myFrame']")
	public WebElement FrameWindow;
	
	@FindBy(xpath="//h2[@class='af-home-title']")
	public WebElement CampusTitle;
	
	@FindBy(xpath="//h4[@class='campus-card-title'][contains(text(),'Buildings')]")
	public WebElement Building;
	
	@FindBy(xpath="//h4[@class='campus-card-title'][contains(text(),'Equipment')]")
	public WebElement Equipment;
	
	@FindBy(xpath="//h4[@class='campus-card-title'][contains(text(),'Emergency')]")
	public WebElement Emergency;
	
	@FindBy(xpath="//h4[@class='campus-card-title'][contains(text(),'Compliance')]")
	public WebElement Compliance;
	
	@FindBy(css=".btn-toggle")
	public WebElement MenuButton;
	
	
	
	

}
