package Steps;



import com.arc.pages.topnavigation.TopNavigationPage;

import Pages.Actions.AfterLogin.CampusListPage;
import Pages.Actions.AfterLogin.ExistingCampusHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NavigateIntoExistingCampus {
	
	TopNavigationPage topnav=new TopNavigationPage();
	CampusListPage campuslist=new CampusListPage();
	
	@Then("^Click on Campuses menu from the top menubar$")
	public void click_on_Campuses_menu_from_the_top_menubar() throws Throwable {
	    topnav.clickonCampusmenu();
	}

	@And("^Select \"([^\"]*)\" campus from the campuslist and click on it$")
	public void select_campus_from_the_campuslist_and_click_on_it(String campusname) throws Throwable {
		ExistingCampusHomePage existingcampushome=campuslist.navigateInsideanExistingCampus(campusname);
		
	}

	@Then("^user should be navigated inside into Campus Home Page$")
	public void user_should_be_navigated_inside_into_Campus_Home_Page() throws Throwable {
	   System.out.println("I am in Campus Home Page");
	}


}
