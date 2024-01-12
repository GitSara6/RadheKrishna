package StepDefination;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstProgramSteps {
	@Given("User is on Net Bankin landing Page")
	public void user_is_on_net_bankin_landing_page() {
	    System.out.println("Landing Page");
	}
	@When("user login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String userName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println(userName + " "+Password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Home Page");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Cards Displayed");
	}
	
	@Given("User is on Phone Bankin landing Page")
	public void user_is_on_phone_bankin_landing_page() {
		System.out.println("phone Displayed");
	}
	@When("user login into application online")
	public void user_login_into_application_online(List<String> data) {
		System.out.println(data.size());
//		for(int i=0; i<data.size(); i++)
//		{
//			System.out.println(data.get(i));
//			  
//		}
		for(String i:data)
		{
			System.out.println(i);
		}
	  
	}
	@Then("landing Page is displayed")
	public void landing_page_is_displayed() {
		System.out.println("Langing phone banking Displayed");
	}
@Given("Env is stable")
public void Env_is_stable() {
	System.out.println("Env is stable");
}
}

