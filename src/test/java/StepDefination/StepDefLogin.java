package StepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefLogin {
	
	
	
	@Given("User is on NetBankingn Landing page")
	public void user_is_on_net_bankingn_landing_page() {
		System.out.println("User is on NetBankingn Landing page");
	
	}
	
	@Given("Validate the browser")
	public void validate_the_browser() {
	    System.out.println("Desiding the Browser Open");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
	    System.out.println("Browser is Triggered");
	}

	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	   System.out.println("Browser is started");
	}

	@When("User Login into application with {string} ans password {string}")
    public void user_login_into_application_with_ans_password(String string, String string2) {
    System.out.println(string);
    System.out.println(string2);
    
}
	@When("User signup with following details")
	public void user_signup_with_following_details(DataTable data) {
		List<List<String>> list = data.asLists();
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(0).get(2));
		System.out.println(list.get(0).get(3));
		System.out.println(list.get(0).get(4));
	    
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("Home page is populated");
	    
	}

	@And("cards are displayed are {string}")
	public void cards_are_displayed_are(String string) {
	    System.out.println(string);
	}
	
	@When("User Login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    System.out.println(username);
	    System.out.println(password);
	}

}
