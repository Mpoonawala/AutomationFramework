package stepdef;

import PageOjects.geolocation;
import cucumber.api.java.en.*;

public class GeolocationStepDef extends geolocation{
	
	@Given("^\"([^\"]*)\" browser should be launched$")
	public void browser_should_be_launched(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.browser(arg1);
	}
	
	@Then("^open url \"([^\"]*)\"$")
	public void open_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	   this.openurl(arg1);
	}

	@Then("^verify \"([^\"]*)\" page$")
	public void verify_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.closeBrowser();
	   
	}


	
	

}
