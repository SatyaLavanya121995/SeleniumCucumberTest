package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class BasePage extends HomePage {
    @Given("^User navigates to the login page$")
    public void user_navigates_to_the_login_page() {
        loginURL("Orange");
    }
    @When("User enters the login details {string} {string}")
    public void user_enters_the_login_details(String username,String password) {
        entercredentials(username,password);
    }
    @Then("User should be able to view the dashboard")
    public void user_should_be_able_to_view_the_dashboard() {
        validateLogin();
    }
    @Given("^I login to location site$")
    public void I_login_to_location_site() {
        loginURL("location");
    }
}
