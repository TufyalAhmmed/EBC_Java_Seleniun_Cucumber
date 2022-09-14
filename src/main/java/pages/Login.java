package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public WebDriver driver;

  private By usenameLink = By.xpath("//input[@id='mat-input-1']");
  private By passwordLink = By.xpath("//input[@id='mat-input-2']");
  private By submitBtn = By.xpath("//button[normalize-space()='Log In']");
  private By qcAllocatorRadioBtn = By.xpath("//div[@class='mat-radio-outer-circle']");
  private By roleSubmitBtn = By.xpath("//input[@value='Submit']");


       public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsenameLink(){
           driver.findElement(usenameLink).sendKeys("QCAllocator@in.com");
    }
    public void setPasswordLink(){
           driver.findElement(passwordLink).sendKeys("123");
    }
    public void setSubmitBtn(){
           driver.findElement(submitBtn).click();
    }
    public void setQcAllocatorRadioBtn(){
           driver.findElement(qcAllocatorRadioBtn).click();
    }
    public void setRoleSubmitBtn(){
           driver.findElement(roleSubmitBtn).click();
    }

}
