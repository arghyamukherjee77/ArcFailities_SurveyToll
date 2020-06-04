package Pages.Actions.AfterLogin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Actions.AfterLogin.Locators.CampusListPageLocators;
import Utils.SeleniumDriver;

public class CampusListPage extends Page{
	
	CampusListPageLocators cp;
	
	public CampusListPage()
	{
		this.cp=new CampusListPageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10);
		PageFactory.initElements(factory, this.cp);
	}
	
	public static void navigateIntoFrame() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement frame=SeleniumDriver.getDriver().findElement(By.xpath("//iframe[@id='myFrame']"));
		SeleniumDriver.getDriver().switchTo().frame(frame);	
	}
	
	public static void defaultView()
	{
		SeleniumDriver.getDriver().switchTo().defaultContent();
	}
	
	public void createCampus() throws InterruptedException
	{
		navigateIntoFrame();
		cp.createCampus.click();
		Set<String> windows= SeleniumDriver.getDriver().getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		SeleniumDriver.getDriver().switchTo().window(childwindow);
		SeleniumDriver.getDriver().manage().window().maximize();
		cp.campusname.sendKeys("Arghya Testing Code 1");
		Select sp=new Select(cp.countrydropdown);
		sp.selectByIndex(10);
		Thread.sleep(1000);
		Select sp1=new Select(cp.statedropdown);
		sp1.selectByIndex(2);
		SeleniumDriver.getDriver().close();
		SeleniumDriver.getDriver().switchTo().window(parentwindow);
		defaultView();
	}
	
	public ExistingCampusHomePage navigateInsideanExistingCampus(String campusname) throws InterruptedException
	{
		navigateIntoFrame();
		String beforexpath= "//*[@id='listGrid']/div[2]/table/tbody/tr[";
		String afterxpath=  "]/td[3]/a";
		List<WebElement> rows=SeleniumDriver.getDriver().findElements(By.xpath("//*[@id='listGrid']/div[2]/table/tbody/tr"));
		
		for(int i=2;i<=rows.size();i++)
		{
			String actualpath=beforexpath+i+afterxpath;
			try{
			if(SeleniumDriver.getDriver().findElement(By.xpath(actualpath)).getText().equals(campusname))
                      {
	                      
				          WebElement campus= SeleniumDriver.getDriver().findElement(By.xpath(actualpath));
				          JavascriptExecutor js=(JavascriptExecutor)SeleniumDriver.getDriver();
	                      js.executeScript("arguments[0].scrollIntoView(true);", campus);
	                      Thread.sleep(3000);
	                      campus.click();
	                      break;
                      }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		defaultView();
		return new ExistingCampusHomePage();
		
	}
    
}
