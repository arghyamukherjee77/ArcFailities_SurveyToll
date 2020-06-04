package com.arc.pages.topnavigation;


import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumDriver;

public class TopNavigationPage {
	
	public TopNavigationPageLocators topnavloc;
	
	public TopNavigationPage() {
		
		this.topnavloc=new TopNavigationPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.topnavloc);
	}
	
	
	public void clickonCampusmenu()
	{
		topnavloc.capusmenu.click();
	}

}
