package steps;

import static org.testng.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("I enter valid username as {string} and valid password as {string}")
	public void i_enter_valid_username_as_and_valid_password_as(String username, String password) {

		System.out.println("your username is: " + username + " and passord is: " + password);

	}

	@When("I click ons Login button")
	public void i_click_ons_login_button() {

		System.out.println("Login button is clicked!");

	}

	@Then("I should see home Page")
	public void i_should_see_home_page() {
		System.out.println("i should see the home page");

	}

	@Given("I enter invalid username as {string} and valid password as {string}")
	public void i_enter_invalid_username_as_and_valid_password_as(String username, String password) {
		System.out.println("your username is: " + username + " and passord is: " + password);

	}

	@Then("I should see error message {string}")
	public void i_should_see_error_message(String message) {
		System.out.println("error message: " + message);
	}

	@Given("I enter valid username as {string} and invalid password as {string}")
	public void i_enter_valid_username_as_and_invalid_password_as(String username, String password) {
		System.out.println("your username is: " + username + " and passord is: " + password);
		assertFalse(true);
	}

	@Given("I enter invalid username as {string} and invalid password as {string}")
	public void i_enter_invalid_username_as_and_invalid_password_as(String username, String password) {
		System.out.println("your username is: " + username + " and passord is: " + password);
		assertFalse(true);
	}
}
