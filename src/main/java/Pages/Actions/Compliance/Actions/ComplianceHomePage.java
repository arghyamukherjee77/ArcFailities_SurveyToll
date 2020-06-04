package Pages.Actions.Compliance.Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.Actions.Compliance.Surveytab.SurveryTab;
import Utils.SeleniumDriver;

public class ComplianceHomePage {
	
	ComplianceHomePageLocators compliancelocator;
	
	public ComplianceHomePage()
	{
		this.compliancelocator=new ComplianceHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.compliancelocator);	
	}
	
	public void goinsideframe() throws InterruptedException
	{
        Thread.sleep(3000);
		SeleniumDriver.getDriver().switchTo().frame(compliancelocator.FrameWindow);
	}
	
	public void switchtoDefault() throws InterruptedException
	{
        Thread.sleep(3000);
		SeleniumDriver.getDriver().switchTo().defaultContent();
	}
	
	public String verifytheHeaderTextOfComplianceHome() throws InterruptedException
	{
		goinsideframe();
		String ActualHeader=compliancelocator.pageheader.getText();
		System.out.println("Header of the Compliance Home Page is:"+ActualHeader);
		switchtoDefault();
		return ActualHeader;
		
	}
	
	public String verifytheHeaderTextOfComplianceChapter() throws InterruptedException
	{
		goinsideframe();
		String chapterHeader=compliancelocator.Chapterheader.getText();
		System.out.println("Header of the Chapter Home Page is: "+chapterHeader);
		switchtoDefault();
		return chapterHeader;
		
		
	}
	
	public SurveryTab navigateToSurveytab() throws InterruptedException
	{
		goinsideframe();
		compliancelocator.SurveysTab.click();
		switchtoDefault();
		return new SurveryTab();
		
	}

}
