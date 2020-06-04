package Pages.Actions.Compliance.Surveytab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumDriver;

public class SurveryTab {

	SurveyTabLocators surveytablocators;
	
	public SurveryTab()
	{
		this.surveytablocators=new SurveyTabLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.surveytablocators);	
	}
	
	public String verifythepresenceofValidationMessageforNoSurvey() throws InterruptedException
	{
		Thread.sleep(4000);
		SeleniumDriver.getDriver().switchTo().frame(surveytablocators.FrameWindow);
		String actualvalidation = null;
		if(surveytablocators.surveylist.isDisplayed())
		{
			actualvalidation= "Survey Already Present";
		}
		else if(surveytablocators.nosurveypresencevalidation.isDisplayed())
		{
			//WebElement scroll=SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='container-scroll']"));
			JavascriptExecutor js=(JavascriptExecutor)SeleniumDriver.getDriver();
			js.executeScript("window.scrollBy(0,550)");
			actualvalidation= surveytablocators.nosurveypresencevalidation.getText();
		}
		SeleniumDriver.getDriver().switchTo().defaultContent();
		return actualvalidation;
		
	}

}
