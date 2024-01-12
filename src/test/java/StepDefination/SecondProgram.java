package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondProgram {
	
	@Before("@Credit/Debit")
	public void CreditDebitLaunchURL()
	{
		System.out.println(" Credit Debit url is launched");
		System.out.println(" All Ok");
	}
	
	@Before("@Upi")
	public void UPILaunchURL()
	{
		System.out.println(" UPI url is launched");
	}
	
	@After("@Credit/Debit")
	public void CreditDebitCloseURL()
	{
		System.out.println(" Credit Debit url is Closed");
	}
	
	@After("@Upi")
	public void UPICloseURL()
	{
		System.out.println(" UPI url is Closed");
	}
	@Given ("User is on Home Page")
	public void user_is_on_Home_Page()
	{
		System.out.println("Background User is on home page");
	}
	@Given("Credit user login")
	public void credit_user_login() {
	    System.out.println("Credit user login");
	}
	@When("User enter credit card")
	public void user_enter_credit_card() {
		   System.out.println("User enter credit card");
	}
	@Then("Payment is verified")
	public void payment_is_verified() {
		   System.out.println("Payment is verified");
	}
	@Given("Debit user login")
	public void debit_user_login() {
		   System.out.println("Debit user login");
	}
	@When("User enter Debit card")
	public void user_enter_debit_card() {
		   System.out.println("User enter Debit card");
	}
	@Then("Debit Payment is verified")
	public void debit_payment_is_verified() {
		   System.out.println("Debit Payment is verified");
	}
	
	@Given("Upi user login")
	public void upi_user_login() {
		   System.out.println("Upi user login");
	}
	@When("User enter upi detail")
	public void user_enter_upi_detail() {
		   System.out.println("User enter upi detail");
	}
	@Then("upi Payment is verified")
	public void upi_payment_is_verified() {
		   System.out.println("upi Payment is verified");
	}
}
