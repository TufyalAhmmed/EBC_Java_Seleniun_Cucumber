package StepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.L2_PendingReview;
import utils.baseTests;

import java.net.MalformedURLException;

public class L2_PendingReviewSteps {
    public WebDriver driver;
    L2_PendingReview l2_PendingReview;
    //baseTests base;

    public L2_PendingReviewSteps(baseTests base) throws MalformedURLException {

        this.driver = base.setUp();
        l2_PendingReview = new L2_PendingReview(driver);
    }
    @When("Click on L2_PendingReview")
    public void click_on_l2_pending_review() throws InterruptedException {
        Thread.sleep(5000);
        l2_PendingReview.setL2PendingReview();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
    }
    @When("Provide Ey-ID")
    public void provide_ey_id() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.seteYIdFieldLink();
        Thread.sleep(2000);
    }
    @When("Provide AssignTo info")
    public void provide_assign_to_info() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setAssignInfo();
        Thread.sleep(2000);
    }
    @When("Provide EYCheckId")
    public void provide_ey_check_id() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setEyCheckId();
        Thread.sleep(2000);
    }
    @When("Provide client info")
    public void provide_client_info() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setClientInfo();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
    }
    @When("Provide severity info")
    public void provide_severity_info() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setSeverity();
        Thread.sleep(2000);
    }
    @When("Provide CheckType info")
    public void provide_check_type_info() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setCheckType();
        Thread.sleep(2000);
    }
    @When("Provide candidate Name")
    public void provide_candidate_name() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setCandidateName();
        Thread.sleep(2000);
    }
    @When("Click on TAT status Dropdown")
    public void click_on_tat_status_dropdown() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setTatStatusDropdown();
        Thread.sleep(2000);
    }
    @When("Select Out of TAT")
    public void select_out_of_tat() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setOutOfTAT();
        Thread.sleep(2000);
    }
    @When("Click on Family Type DropDown")
    public void click_on_family_type_drop_down() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setFamilyTypeDropdown();
        Thread.sleep(2000);
    }
    @When("Select Address Check")
    public void select_address_check() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setFamilyTypeDropdownAddressCheck();
        Thread.sleep(2000);
    }
    @When("Scroll the page")
    public void scroll_the_page() throws InterruptedException {
       Thread.sleep(5000);
       l2_PendingReview.setScrollPage();
       Thread.sleep(2000);
    }
    @When("Scroll & select Identified entity checkbox")
    public void scroll_select_identified_entity_checkbox() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setScrollandSelectCheckbox();
        Thread.sleep(2000);
    }
    @When("Scroll TillSelectanAction")
    public void scroll_till_selectan_action() throws InterruptedException {
       Thread.sleep(3000);
       l2_PendingReview.setScrollbeforeAnActionMethod();
       Thread.sleep(2000);
    }
    @When("Click on select an action Dropdown")
    public void click_on_select_an_action_dropdown() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setActionDropdown();
        Thread.sleep(2000);
    }
    @When("Select Assign to QC verifier")
    public void select_assign_to_qc_verifier() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setSelectAssigntoQCVerifier();
        Thread.sleep(2000);
    }
    @When("Click on Assign user Dropdown")
    public void click_on_assign_user_dropdown() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setAssignUserDropdown();
        Thread.sleep(2000);
    }
    @When("Click on QC verifier Executive")
    public void click_on_qc_verifier_executive() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setQcVerifierExecutive();
        Thread.sleep(2000);
    }
    @Then("Click on Assign Button")
    public void click_on_assign_button() throws InterruptedException {
        Thread.sleep(2000);
        l2_PendingReview.setAssignButton();
        Thread.sleep(2000);

    }

}
