package Pages.Actions.AfterLogin;

import org.openqa.selenium.devtools.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;


import Pages.Actions.AfterLogin.Locators.CampusHomePageLocators;
import Pages.Actions.Compliance.Actions.ComplianceHomePage;
import Utils.SeleniumDriver;

public class ExistingCampusHomePage extends Page{
	
	public CampusHomePageLocators campushomelocators;
	
	public ExistingCampusHomePage()
	{
		this.campushomelocators=new CampusHomePageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10);
		PageFactory.initElements(factory, this.campushomelocators);
	}
	
	public void navigateIntoFrmae() throws InterruptedException
	{
		Thread.sleep(5000);
		SeleniumDriver.getDriver().switchTo().frame(campushomelocators.FrameWindow);	
	}
	
	public void defaultView()
	{
		SeleniumDriver.getDriver().switchTo().defaultContent();
	}
	
	public void verifyTitle(String title) throws InterruptedException
	{
	    navigateIntoFrmae();
		String CampusTitle=campushomelocators.CampusTitle.getText();
		System.out.print("Campus Title is: "+CampusTitle);
		Assert.assertEquals(CampusTitle, title, "String matched");
		defaultView();
	}
	
	public void navigateToEquipmentModule() throws InterruptedException
	{
		navigateIntoFrmae();
		campushomelocators.Equipment.click();
		defaultView();
	}
	
	public ComplianceHomePage navigateToComplianceModule() throws InterruptedException
	{
		navigateIntoFrmae();
		campushomelocators.Compliance.click();
		defaultView();
		return new ComplianceHomePage();
	}
	
	
	

}
