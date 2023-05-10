package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.BasicInformationpage;
import page.Homepage;

public class basicInformationSteps {

 static WebDriver driver=StepBase.driver;

 BasicInformationpage basicInformationpage;

    @Given("I want to go to {string} in step")
    public void i_want_to_go_to_in_step(String url) {
        // Write code here that turns the phrase above into concrete actions
       driver.get(url);
    }
    @When("I type {string} and click next button")
    public void i_type_and_click_next_button(String firstname) {
        // Write code here that turns the phrase above into concrete actions
       Homepage homepage =new Homepage(driver);
        homepage.clickOnCreateGoogleAccount(firstname);
        homepage.clickNext();
    }

    @When("I type the {string} mo")
    public void i_type_the_mo(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      basicInformationpage=new BasicInformationpage(driver);
      basicInformationpage.typeMonth(string);
    }
    @When("I type the {string} day")
    public void i_type_the_day(String string) {
        // Write code here that turns the phrase above into concrete actions
       basicInformationpage.typeDay(string);
    }
    @When("I type the {string} year")
    public void i_type_the_year(String string) {
        // Write code here that turns the phrase above into concrete actions
        basicInformationpage.typeYear(string);
    }
    @When("I type the {string} gender")
    public void i_type_the_gender(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      basicInformationpage.typeGender(string);
    }
    @When("I click on next")
    public void i_click_on_next() {
        // Write code here that turns the phrase above into concrete actions
        basicInformationpage.clickNext1();

    }
    @Then("I verify the <status> in step")
    public void i_verify_the_status_in_step() {
        // Write code here that turns the phrase above into concrete actions

    }

////div[@role='radio']
    //charles235555979667

}
