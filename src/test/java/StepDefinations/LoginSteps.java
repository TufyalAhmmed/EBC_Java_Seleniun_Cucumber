package StepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Login;
import utils.baseTests;

import java.net.MalformedURLException;

public class LoginSteps {
    public WebDriver driver;
    Login login;
    //baseTests base;

    public LoginSteps(baseTests base) throws MalformedURLException {

        this.driver = base.setUp();
        login = new Login(driver);
    }
    @Given("User on Login Page")
    public void user_on_login_page() throws InterruptedException {
        Thread.sleep(5000);
    }
    @When("User enters Username {string} into the Username field")
    public void user_enters_username_into_the_username_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        login.setUsenameLink();
        Thread.sleep(2000);
    }
    @When("user enters Password {string} into the password field")
    public void user_enters_password_into_the_password_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        login.setPasswordLink();
        Thread.sleep(2000);
    }
    @When("Click on Login Button")
    public void click_on_login_button() throws InterruptedException {
        Thread.sleep(2000);
        login.setSubmitBtn();
        Thread.sleep(2000);
    }
    @When("Select on QC Allocator radio Button")
    public void select_on_qc_allocator_radio_button() throws InterruptedException {
        Thread.sleep(5000);
        login.setQcAllocatorRadioBtn();
        Thread.sleep(3000);
    }
    @Then("Click on Submit Button")
    public void click_on_submit_button() throws InterruptedException {
        Thread.sleep(5000);
        login.setRoleSubmitBtn();
        Thread.sleep(5000);
    }
}
