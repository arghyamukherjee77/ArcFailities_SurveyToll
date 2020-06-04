package Pages.Actions.Compliance.Actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplianceHomePageLocators {
	

	@FindBy(xpath="//iframe[@id='myFrame']")
	public WebElement FrameWindow;
	
	@FindBy (xpath ="//h1[contains(text(),'Compliance')]")
	public WebElement pageheader;
	
	@FindBy (xpath="//ul[@class='nav nav-tabs']//span[text()='Chapters']")
	public WebElement ChapterTabs;
	
	@FindBy(xpath="//a[@id='tab2-link']//span[text()='Surveys']")
	public WebElement SurveysTab;
	
	@FindBy(xpath="//tab[@id='tab1']//h3")
	public List<WebElement> chapterlist;
	
	@FindBy(xpath="//tab[@id='tab1']//span")
	public WebElement Chapterheader;
	
	@FindBy(xpath="//tab[@id='tab1']//div[@class='notification']")
	public WebElement EnvironmentOfCareChapter_notification;
	
	@FindBy(xpath="//tab[@id='tab1']//h3[text()='Environment of Care']")
	public WebElement EnvironmentofCare_text;
	
	

}
