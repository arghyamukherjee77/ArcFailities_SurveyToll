package Pages.Actions.Compliance.Surveytab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurveyTabLocators {
	
	@FindBy(xpath="//iframe[@id='myFrame']")
	public WebElement FrameWindow;
	
	@FindBy(xpath = "//*[@id=\"tab2\"]//p[text()='You have no surveys. Tap Create survey to start one.']")
	public WebElement nosurveypresencevalidation;
	
	@FindBy(xpath="//div[@class='tab-content']//div[@class='file-content']")
	public WebElement surveylist;

}
