/*package stepdef;

import PageOjects.HomePage;
import cucumber.api.java.en.*;

public class HomeStepDef extends HomePage{
	
	@Given("^\"([^\"]*)\" browser is launched$")
	public void browser_is_launched(String arg1) throws Throwable {
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
		System.out.println("Verify page content");
	  
	}

	@Then("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on links");
	    
	}
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  super.closeBrowser();
	}


}
*/