package StepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.InRework;
import utils.baseTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class InReworkSteps {
    public WebDriver driver;
    InRework inRework;
    //baseTests base;

    public InReworkSteps(baseTests base) throws MalformedURLException{

        this.driver = base.setUp();
        inRework = new InRework(driver);
    }
    @When("Click on In Rework DropDown")
    public void click_on_in_rework_drop_down() throws InterruptedException {
      Thread.sleep(5000);
        inRework.setInReworkLink();
//        driver.manage().timeouts().wait(2000);
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
    }
    @When("Provide EY-ID")
    public void provide_ey_id() throws InterruptedException {
        Thread.sleep(3000);
        inRework.seteYIdFieldLink();
        Thread.sleep(2000);


    }
//    @Then("Search After providing EY-ID")
//    public void search_after_providing_ey_id() {
//
//    }
    @When("Provide Assign to info")
    public void provide_assign_to_info() throws InterruptedException {
        Thread.sleep(2000);
        inRework.setAssignInfo();
        Thread.sleep(2000);
    }
    @When("Provide EY-Check-Id")
    public void provide_ey_check_id() throws InterruptedException {
        Thread.sleep(2000);
        inRework.setEyCheckId();
        Thread.sleep(2000);
    }
    @When("Provide Client info")
    public void provide_client_info() throws InterruptedException {
     Thread.sleep(2000);
     inRework.setClientName();
     Thread.sleep(1000);

    }
    @When("Provide Severity info")
    public void provide_severity_info() throws InterruptedException {
        Thread.sleep(2000);
        inRework.setSeverity();
        Thread.sleep(1000);

    }
//    @When("Provide CheckType info")
//    public void provide_check_type_info() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("Provide Candidate Name")
    public void provide_candidate_name() throws InterruptedException {
        Thread.sleep(2000);
        inRework.setCandidateName();
        Thread.sleep(1000);

    }

}
