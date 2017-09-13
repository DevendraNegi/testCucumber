package org.dev.test.firsttime.testCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {

	@Given("^I am in facbook login page$")
	public void i_am_in_facbook_login_page() throws Throwable {
		System.out.println("@Given");
	}

	@When("^I fill the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_fill_the_username_as_and_password_as(String email, String password) throws Throwable {
		System.out.println("@When");
	}

	@Then("^It should navigate me to the facebook home page$")
	public void it_should_navigate_me_to_the_facebook_home_page() throws Throwable {
		System.out.println("@Then");
	}

}
