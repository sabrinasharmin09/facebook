package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.Homepage;

public class homepageSteps {

     WebDriver driver=StepBase.driver;
     Homepage homepage;

    @Given("I am in homepage {string}")
    public void i_am_in_homepage(String url) {
        // Write code here that turns the phrase above into concrete actions
      driver.get(url);
    }
    @When("I enter {string}")
    public void i_enter(String firstname) {
        // Write code here that turns the phrase above into concrete actions
   homepage =new Homepage(driver);
   homepage.clickOnCreateGoogleAccount(firstname);
    }
    @When("click on next")
    public void click_on_next() {
        // Write code here that turns the phrase above into concrete actions
    homepage.clickNext();
    }
    @Then("I am in create new account page")
    public void i_am_in_create_new_account_page() {
        // Write code here that turns the phrase above into concrete actions

    }




}
