package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Login;
import pages.QcAllocator;
import utils.baseTests;

import java.net.MalformedURLException;

public class QcAllocatorSteps {
    public WebDriver driver;
    pages.QcAllocator qcAllocator;
    //baseTests base;

    public QcAllocatorSteps(baseTests base) throws MalformedURLException {

        this.driver = base.setUp();
        qcAllocator = new QcAllocator(driver);
    }
    @When("Click on Status DropDown")
    public void click_on_status_drop_down() throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setStatusDropdownLink();
        Thread.sleep(2000);
    }
    @When("Select Closed Checkbox")
    public void select_closed_checkbox() throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setClosedLink();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }
    @When("Click on Assigned to")
    public void click_on_assigned_to() throws InterruptedException {
        Thread.sleep(2000);
      qcAllocator.setAssignedToLink();
      Thread.sleep(2000);
    }
    @When("Click on Search")
    public void click_on_search() throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setSearchBtn();
        Thread.sleep(2000);
    }

    @When("Scroll into the Bottom of page")
    public void scroll_into_the_bottom_of_page() throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setScrollBottom();
        Thread.sleep(2000);
    }
    @When("again Scroll into Top of the page")
    public void again_scroll_into_top_of_the_page() throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setScrollTop();
        Thread.sleep(2000);
    }
    @When("Enter EY Check ID {string}")
    public void enter_ey_check_id(String string) throws InterruptedException {
        Thread.sleep(2000);
        qcAllocator.setEyCheckId();
        Thread.sleep(2000);
    }
    @Then("Click On Search Button")
    public void click_on_search_button() throws InterruptedException {
        Thread.sleep(4000);
        qcAllocator.setEySearchBtn();
        Thread.sleep(4000);
    }

}
