package Steps;

import Utils.SeleniumDriver;
import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public static void closeBrowser()
	{
		SeleniumDriver.tearDown();
	}

}
