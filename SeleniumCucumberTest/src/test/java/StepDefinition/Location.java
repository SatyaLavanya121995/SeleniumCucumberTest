package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocationPage;

public class Location extends LocationPage {
    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String string) {
        navigateToTab();
    }
    @When("User clicks on directions")
    public void user_clicks_on_directions() {
       navigateToDirections();
    }
    @Then("Map should be displayed with directions")
    public void map_should_be_displayed_with_directions() {
      mapDisplay();
    }

}
